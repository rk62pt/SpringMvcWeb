package main.ryan.test.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import main.ryan.test.business.TestManager;
import main.ryan.test.business.vo.TestVO;

@Service("TestService")
public class TestManagerImpl implements TestManager {

	@Override
	public List<TestVO> search() throws Exception {
		List<TestVO> voList = new ArrayList<TestVO>();
		TestVO vo = new TestVO();
		vo.setCity("台北市");
		vo.setDescription("臺北市是中華民國的直轄市與首都，自1949年底起成為中華民國中央政府所在地");
		voList.add(vo);
		vo = new TestVO();
		vo.setCity("新北市");
		vo.setDescription("新北市是中華民國的直轄市，為臺灣人口排名第一的都市。全境環繞臺北市");
		voList.add(vo);
		return voList;
	}

}
