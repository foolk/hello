package generate;

import generate.Kh;

public interface KhDao {
    int deleteByPrimaryKey(Integer kid);

    int insert(Kh record);

    int insertSelective(Kh record);

    Kh selectByPrimaryKey(Integer kid);

    int updateByPrimaryKeySelective(Kh record);

    int updateByPrimaryKey(Kh record);
}