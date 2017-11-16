package com.tencent.xweb.xwalk;

import android.view.View;
import org.xwalk.core.CustomViewCallback;
import org.xwalk.core.XWalkJavascriptResult;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;

public class i
  extends XWalkUIClient
{
  public i(XWalkView paramXWalkView)
  {
    super(paramXWalkView);
  }
  
  public final void a(View paramView, CustomViewCallback paramCustomViewCallback)
  {
    super.onShowCustomView(paramView, paramCustomViewCallback);
  }
  
  public final void a(XWalkView paramXWalkView, String paramString)
  {
    super.onPageLoadStarted(paramXWalkView, paramString);
  }
  
  public final boolean a(XWalkView paramXWalkView, String paramString1, String paramString2, String paramString3, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    return super.onJsPrompt(paramXWalkView, paramString1, paramString2, paramString3, paramXWalkJavascriptResult);
  }
  
  public final boolean a(XWalkView paramXWalkView, String paramString1, String paramString2, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    return super.onJsConfirm(paramXWalkView, paramString1, paramString2, paramXWalkJavascriptResult);
  }
  
  public final boolean b(XWalkView paramXWalkView, String paramString1, String paramString2, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    return super.onJsAlert(paramXWalkView, paramString1, paramString2, paramXWalkJavascriptResult);
  }
  
  public final void csv()
  {
    super.onHideCustomView();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */