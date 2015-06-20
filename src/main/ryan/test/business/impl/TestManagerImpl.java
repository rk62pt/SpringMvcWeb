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
		vo.setDescription("新北市旁邊");
		voList.add(vo);
		vo = new TestVO();
		vo.setCity("新北市");
		vo.setDescription("在台北市旁邊");
		voList.add(vo);
		return voList;
	}

}
