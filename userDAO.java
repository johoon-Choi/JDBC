package johoon;

import java.util.List;

public interface userDAO {
	public int insert(userVO vo);
	public int update(userVO vo);
	public int delete(userVO vo);
	public int deleteAll();
	public void set_auto_increment();
	public userVO selectOne(userVO vo);
	public List<userVO> selectAll();
}
