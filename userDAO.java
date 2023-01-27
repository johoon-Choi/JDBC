package johoon;

import java.util.List;

public interface userDAO {
	public int insert(userVO vo);
	public int update(userVO vo);
	public int delete(userVO vo);
	public int deleteAll();
	public userVO selectOne(userVO vo);
	public List<userVO> selectAll();
}
