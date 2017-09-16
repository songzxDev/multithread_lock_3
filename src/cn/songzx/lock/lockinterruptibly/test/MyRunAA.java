/**   
* @Title: MyRunAA.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午8:20:44 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.service.MyServiceA;

/**
 * @ClassName: MyRunAA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午8:20:44
 * 
 */
public class MyRunAA {

	/**
	 * @Date: 2017年9月16日下午8:20:44
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) throws Exception {
		final MyServiceA service = new MyServiceA();
		Runnable runnableRef = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "调用waitMethod时间为：" + System.currentTimeMillis());
				service.waitMethodParam();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("ThreadA");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("ThreadB");
		threadB.start();
	}

}
