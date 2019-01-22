package com.github.jayuc.common.iter;

/**
 * 日志管理器
 * @author yujie
 *
 */
public interface ILogger {

	/**
	 * 通过class 生成日志类
	 * @param clazz
	 * @return
	 */
	Object getLogger(Class<?> clazz);
	
	/**
	 * 生成默认日志类
	 * @return
	 */
	Object getLogger();
	
}
