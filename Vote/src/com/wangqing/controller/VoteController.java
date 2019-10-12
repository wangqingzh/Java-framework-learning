package com.wangqing.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangqing.bean.AgeVote;
import com.wangqing.bean.User;
import com.wangqing.bean.VoteZongzi;
import com.wangqing.service.imp.VoteServiceImp;

@Controller
public class VoteController {
	@Resource(name="voteServiceImp")
	private VoteServiceImp voteServiceImp;
	
	//投票控制
	@RequestMapping("vote")
	public String vote(VoteZongzi voteZongzi, HttpSession session) {
		User user = (User) session.getAttribute("user_session");
		Integer userId = user.getUserId();
		if(voteServiceImp.selectVoteById(userId) == null) {
			voteZongzi.setUserId(user.getUserId());
			voteServiceImp.insertVote(voteZongzi);
			return "redirect:/resultController";
		}
		
		return "redirect:/updateVote";
		
	}
	//重新投票控制
	@RequestMapping("updateVote")
	public String updateVote(VoteZongzi voteZongzi, HttpSession session) {
		User user = (User) session.getAttribute("user_session");
		voteZongzi.setUserId(user.getUserId());
		voteServiceImp.updateVote(voteZongzi);
		return "redirect:/resultController";
	}
	//结果分析控制
	@RequestMapping("resultController")
	public String resultController(Map<String, Integer> map) {
		Integer saltyCount = voteServiceImp.countVote("salty");
		Integer sweetCount = voteServiceImp.countVote("sweet");
		//sex vote
		int fsaltyCount = voteServiceImp.countVoteBySex("f", "salty");
		int fsweetCount = voteServiceImp.countVoteBySex("f", "sweet");
		int msaltyCount = voteServiceImp.countVoteBySex("m", "salty");
		int msweetCount = voteServiceImp.countVoteBySex("m", "sweet");
		//age vote
		
		List<AgeVote> ageVote = voteServiceImp.countVoteByAge("salty");
		for (AgeVote ageVote2 : ageVote) {
			System.out.println("\n\n\n\n" + ageVote2.getAge());
		}
		System.out.println(fsaltyCount + "\n" + fsweetCount + "\n" + msaltyCount + "\n" + msweetCount);
		map.put("salty", saltyCount);
		map.put("sweet", sweetCount);
		map.put("fsaltyCount", fsaltyCount);
		map.put("fsweetCount", fsweetCount);
		map.put("msaltyCount", msaltyCount);
		map.put("msweetCount", msweetCount);
		return "result";
	}
	
	
}
