package com.huzan.zanbaseframe.base.mvp;

/**
 * Created by ZAN on 2017/7/19.
 */

public interface BasePresenter extends IPresenter{
	
//	void attachView(T View);
//	
//	void detachView();
	
	/*//将所有正在处理的Subscription都添加到CompositeSubscription中。统一退出的时候注销观察
	private CompositeDisposable mCompositeDisposable;
	
	protected void addDisposable(Disposable subscription) {
		if (mCompositeDisposable == null || mCompositeDisposable.isDisposed()) { //csb 如果解绑了的话添加 sb 需要新的实例否则绑定时无效的
			mCompositeDisposable = new CompositeDisposable();
		}
		mCompositeDisposable.add(subscription);
	}
	
	//在界面退出等需要解绑观察者的情况下调用此方法统一解绑，防止Rx造成的内存泄漏
	public void dispose() {
		if (mCompositeDisposable != null) {
			mCompositeDisposable.dispose();
		}
	}*/
}
