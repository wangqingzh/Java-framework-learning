package com.wangqing.service;

import java.util.List;

import com.wangqing.bean.AgeVote;
import com.wangqing.bean.VoteZongzi;

public interface VoteService {
	public void insertVote(VoteZongzi voteZongzi);
	public VoteZongzi selectVoteById(Integer userId);
	public int countVote(String vote);
	public int countVoteBySex(String sex, String vote);
	public void updateVote(VoteZongzi votezZongzi);
	public List<AgeVote> countVoteByAge(String vote);
}
