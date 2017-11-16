package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a.b;
import java.lang.reflect.Field;
import java.util.List;

public class AppBrandSOSUI
  extends FTSSOSMoreWebViewUI
{
  private View iBI;
  private String iBJ;
  private String iBK;
  private int scene;
  
  public AppBrandSOSUI()
  {
    GMTrace.i(16183168335872L, 120574);
    GMTrace.o(16183168335872L, 120574);
  }
  
  private int aaN()
  {
    int i = 0;
    GMTrace.i(16183973642240L, 120580);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int j = bg.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      j = getResources().getDimensionPixelSize(j);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    GMTrace.o(16183973642240L, 120580);
    return i;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(17303617929216L, 128922);
    if (!TextUtils.isEmpty(paramString2)) {
      this.iBI.setVisibility(8);
    }
    try
    {
      this.ioh.d(10001, null);
      super.a(paramString1, paramString2, paramList, paramb);
      GMTrace.o(17303617929216L, 128922);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandSOSUI", "refresh keyword id error : %s", new Object[] { localRemoteException });
      }
    }
  }
  
  public final boolean aaM()
  {
    GMTrace.i(16183570989056L, 120577);
    this.iBI.setVisibility(8);
    boolean bool = super.aaM();
    GMTrace.o(16183570989056L, 120577);
    return bool;
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(16183839424512L, 120579);
    super.bH(paramView);
    this.iBJ = getIntent().getStringExtra("key_nearby_url");
    getIntent().getStringExtra("key_nearby_list_id");
    this.iBI = getLayoutInflater().inflate(R.i.cpe, (ViewGroup)paramView, false);
    View localView1 = this.iBI.findViewById(R.h.bPA);
    localView1.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19504788668416L, 145322);
        if (TextUtils.isEmpty(AppBrandSOSUI.a(AppBrandSOSUI.this)))
        {
          GMTrace.o(19504788668416L, 145322);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("rawUrl", AppBrandSOSUI.a(AppBrandSOSUI.this));
        localIntent.putExtra("geta8key_scene", 41);
        localIntent.putExtra("show_long_click_popup_menu", false);
        com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(19504788668416L, 145322);
      }
    });
    if (TextUtils.isEmpty(this.iBJ))
    {
      localView1.setVisibility(8);
      this.iBI.setVisibility(8);
    }
    while ((paramView instanceof FrameLayout))
    {
      ((FrameLayout)paramView).addView(this.iBI);
      GMTrace.o(16183839424512L, 120579);
      return;
      localView1.setVisibility(0);
      this.iBI.setVisibility(0);
    }
    paramView = paramView.getLayoutParams();
    int k;
    Rect localRect;
    int i;
    if (getWindow().hasFeature(9))
    {
      localView1 = this.iBI;
      k = this.iBI.getPaddingLeft();
      localRect = new Rect();
      int j = bDU();
      View localView2 = getWindow().getDecorView();
      localView2.getWindowVisibleDisplayFrame(localRect);
      int m = localView2.getHeight();
      int[] arrayOfInt = new int[2];
      localView2.getLocationOnScreen(arrayOfInt);
      i = j;
      if (m == 0) {
        i = j + aaN();
      }
      if ((m - localRect.height() < 0) || (arrayOfInt[1] <= 200)) {
        break label325;
      }
      i += m - localRect.height();
    }
    for (;;)
    {
      localView1.setPadding(k, i + this.iBI.getPaddingTop(), this.iBI.getPaddingRight(), this.iBI.getPaddingBottom());
      addContentView(this.iBI, paramView);
      GMTrace.o(16183839424512L, 120579);
      return;
      label325:
      i += localRect.top;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16183302553600L, 120575);
    super.onCreate(paramBundle);
    overridePendingTransition(R.a.aLC, 0);
    this.iBK = getIntent().getStringExtra("key_session_id");
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    w.i("MicroMsg.AppBrandSOSUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", new Object[] { this.iBK });
    g.ork.i(13929, new Object[] { this.iBK, "", Integer.valueOf(1), Integer.valueOf(this.scene) });
    paramBundle = new Intent();
    paramBundle.putExtra("key_session_id", this.iBK);
    paramBundle.putExtra("ftsbizscene", this.scene);
    setResult(-1, paramBundle);
    GMTrace.o(16183302553600L, 120575);
  }
  
  public void onDestroy()
  {
    GMTrace.i(16183436771328L, 120576);
    if ((this.scene == 3) || (this.scene == 16)) {
      g.ork.i(13929, new Object[] { this.iBK, b.gqX, Integer.valueOf(2), Integer.valueOf(this.scene) });
    }
    super.onDestroy();
    GMTrace.o(16183436771328L, 120576);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandSOSUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */