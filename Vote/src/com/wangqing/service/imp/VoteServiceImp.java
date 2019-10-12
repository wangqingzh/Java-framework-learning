package com.wangqing.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangqing.bean.AgeVote;
import com.wangqing.bean.VoteZongzi;
import com.wangqing.dao.VoteZongziDao;
import com.wangqing.service.VoteService;

@Service("voteServiceImp")
public class VoteServiceImp implements VoteService {
	@Autowired
	private VoteZongziDao voteZongziDao;
	
	@Override
	public void insertVote(VoteZongzi voteZongzi) {
		// TODO Auto-generated method stub
		this.voteZongziDao.insertVote(voteZongzi);
	}

	@Override
	public VoteZongzi selectVoteById(Integer userId) {
		// TODO Auto-generated method stub
		return this.voteZongziDao.selectVoteById(userId);
	}

	@Override
	public int countVote(String vote) {
		// TODO Auto-generated method stub
		return this.voteZongziDao.countVote(vote);
	}

	@Override
	public int countVoteBySex(String sex, String vote) {
		// TODO Auto-generated method stub
		return this.voteZongziDao.countVoteBySex(sex, vote);
	}

	@Override
	public List<AgeVote> countVoteByAge(String vote) {
		// TODO Auto-generated method stub
		return this.voteZongziDao.countVoteByAge(vote);
	}

	@Override
	public void updateVote(VoteZongzi voteZongzi) {
		// TODO Auto-generated method stub
		this.voteZongziDao.updateVote(voteZongzi);
	}

}
