package main.ryan.test.business;

import java.util.List;

import main.ryan.test.business.vo.TestVO;

public interface TestManager {
	public abstract List<TestVO> search() throws Exception;
}
