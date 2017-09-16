/**   
* @Title: MyFirstRun.java 
* @Package cn.songzx.lock.reentrantreadwritelock.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午10:13:20 
* @version V1.0   
*/
package cn.songzx.lock.reentrantreadwritelock.first.test;

import cn.songzx.lock.reentrantreadwritelock.first.extthread.MyFirstThreadA;
import cn.songzx.lock.reentrantreadwritelock.first.extthread.MyFirstThreadB;
import cn.songzx.lock.reentrantreadwritelock.first.service.MyFirstSerivce;

/**
 * @ClassName: MyFirstRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午10:13:20
 * 
 */
public class MyFirstRun {

	/**
	 * @Date: 2017年9月16日下午10:13:20
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyFirstSerivce service = new MyFirstSerivce();
		MyFirstThreadA a = new MyFirstThreadA(service);
		a.setName("A");
		MyFirstThreadB b = new MyFirstThreadB(service);
		b.setName("B");
		a.start();
		b.start();
	}

}
