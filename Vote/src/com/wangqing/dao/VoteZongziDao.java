package com.wangqing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangqing.bean.AgeVote;
import com.wangqing.bean.VoteZongzi;

public interface VoteZongziDao {
	public void insertVote(VoteZongzi voteZongzi);
	public VoteZongzi selectVoteById(Integer userId);
	public int countVote(String vote);
	public int countVoteBySex(@Param("sex") String sex, @Param("vote") String vote);
	public void updateVote(VoteZongzi voteZongzi);
	public List<AgeVote> countVoteByAge(String vote);
}
