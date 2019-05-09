package lmn.com.lmnlibrary.base.rxjava;

import android.widget.Toast;

import io.reactivex.observers.DisposableObserver;
import lmn.com.lmnlibrary.GlobalAppComponent;
import lmn.com.lmnlibrary.http.NoNetWorkException;

/**
 * @author：admin on 2017/4/18 15:14.
 */

public abstract class ErrorDisposableObserver<T> extends DisposableObserver<T> {
    @Override
    public void onError(Throwable e) {
        //此处可按状态码解析或error类型，进行分别处理其他error,此处只处理一种
        if(e instanceof NoNetWorkException){
            Toast.makeText(GlobalAppComponent.getAppComponent().getContext(), "网络连接失败，请重试！", Toast.LENGTH_SHORT).show();
        }
    }
}
