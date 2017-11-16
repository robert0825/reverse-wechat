package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.b;
import com.tencent.mm.api.j;
import com.tencent.mm.api.l;
import com.tencent.mm.api.m;
import com.tencent.mm.api.m.a.a;
import com.tencent.mm.api.m.b;
import com.tencent.mm.api.m.c;
import com.tencent.mm.plugin.u.a.d;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.io.IOException;

public class TestVideoEditUI
  extends MMActivity
  implements com.tencent.mm.api.e
{
  private m njy;
  
  public TestVideoEditUI()
  {
    GMTrace.i(20150375940096L, 150132);
    GMTrace.o(20150375940096L, 150132);
  }
  
  public final void Zp()
  {
    GMTrace.i(20150912811008L, 150136);
    super.Zp();
    GMTrace.o(20150912811008L, 150136);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20151047028736L, 150137);
    int i = a.e.nlf;
    GMTrace.o(20151047028736L, 150137);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(20150778593280L, 150135);
    if (!this.njy.os()) {
      finish();
    }
    GMTrace.o(20150778593280L, 150135);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20150510157824L, 150133);
    super.onCreate(paramBundle);
    lc(true);
    paramBundle = (FrameLayout)findViewById(a.d.content);
    this.njy = m.eqG.ou();
    Object localObject = this.njy;
    m.a.a locala = new m.a.a();
    locala.eqI = false;
    locala.eqK = true;
    locala.eqL = new Rect(0, 0, 1080, 1080);
    locala.eqH = m.c.eqM;
    ((m)localObject).a(locala.oG());
    localObject = this.njy.ad(this.vKB.vKW);
    ((b)localObject).a(this);
    paramBundle.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
    ((b)localObject).eqv = new l()
    {
      public final void a(com.tencent.mm.api.d paramAnonymousd)
      {
        GMTrace.i(20156549955584L, 150178);
        w.i("MicroMsg.TestVideoEditUI", "[onSelectedFeature] features:%s", new Object[] { paramAnonymousd.name() });
        GMTrace.o(20156549955584L, 150178);
      }
      
      public final void a(com.tencent.mm.api.d paramAnonymousd, int paramAnonymousInt)
      {
        GMTrace.i(20156684173312L, 150179);
        w.i("MicroMsg.TestVideoEditUI", "[onSelectedDetailFeature] features:%s index:%s", new Object[] { paramAnonymousd.name(), Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(20156684173312L, 150179);
      }
      
      public final void ap(boolean paramAnonymousBoolean)
      {
        GMTrace.i(20156818391040L, 150180);
        if (paramAnonymousBoolean)
        {
          TestVideoEditUI.this.aLs();
          GMTrace.o(20156818391040L, 150180);
          return;
        }
        TestVideoEditUI.this.db(TestVideoEditUI.a(TestVideoEditUI.this));
        GMTrace.o(20156818391040L, 150180);
      }
    };
    GMTrace.o(20150510157824L, 150133);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20150644375552L, 150134);
    super.onDestroy();
    this.njy.onDestroy();
    GMTrace.o(20150644375552L, 150134);
  }
  
  public final void onFinish()
  {
    GMTrace.i(20151181246464L, 150138);
    this.njy.a(new j()
    {
      public final void a(Bitmap paramAnonymousBitmap, boolean paramAnonymousBoolean)
      {
        GMTrace.i(20166750502912L, 150254);
        w.i("MicroMsg.TestVideoEditUI", "[onSuccess] w:%s h:%s", new Object[] { Integer.valueOf(paramAnonymousBitmap.getWidth()), Integer.valueOf(paramAnonymousBitmap.getHeight()) });
        String str = com.tencent.mm.compatible.util.e.fRY + String.format("%s%d.%s", new Object[] { "wx_photo_edit_", Long.valueOf(System.currentTimeMillis()), "png" });
        try
        {
          com.tencent.mm.sdk.platformtools.d.a(paramAnonymousBitmap, 100, Bitmap.CompressFormat.PNG, str, true);
          GMTrace.o(20166750502912L, 150254);
          return;
        }
        catch (IOException paramAnonymousBitmap)
        {
          GMTrace.o(20166750502912L, 150254);
        }
      }
      
      public final void a(Exception paramAnonymousException)
      {
        GMTrace.i(20166616285184L, 150253);
        GMTrace.o(20166616285184L, 150253);
      }
    });
    GMTrace.o(20151181246464L, 150138);
  }
  
  public final void ow()
  {
    GMTrace.i(20151315464192L, 150139);
    finish();
    GMTrace.o(20151315464192L, 150139);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\TestVideoEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */