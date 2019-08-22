package kr.hsoft.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.hsoft.boot.dto.ProposalDTO;

@Mapper
public interface ProposalMapper {
	public List<ProposalDTO> selectProposals();
	public List<ProposalDTO> selectProposalsForUser(String location);
	public List<ProposalDTO> selectProposalsForMaster(String location);
	public ProposalDTO selectProposal(int seq);
	public void insertProposal(ProposalDTO proposalDTO);
	public void putProposal(@Param("seq") int seq, @Param("proposal") ProposalDTO proposalDTO);
	public void putProposalState(@Param("seq") int seq, @Param("state") boolean state);
	public void deleteProposal(int seq);
}
