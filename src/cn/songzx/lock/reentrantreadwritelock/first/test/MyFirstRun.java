/**   
* @Title: MyFirstRun.java 
* @Package cn.songzx.lock.reentrantreadwritelock.first.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����10:13:20 
* @version V1.0   
*/
package cn.songzx.lock.reentrantreadwritelock.first.test;

import cn.songzx.lock.reentrantreadwritelock.first.extthread.MyFirstThreadA;
import cn.songzx.lock.reentrantreadwritelock.first.extthread.MyFirstThreadB;
import cn.songzx.lock.reentrantreadwritelock.first.service.MyFirstSerivce;

/**
 * @ClassName: MyFirstRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����10:13:20
 * 
 */
public class MyFirstRun {

	/**
	 * @Date: 2017��9��16������10:13:20
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
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
