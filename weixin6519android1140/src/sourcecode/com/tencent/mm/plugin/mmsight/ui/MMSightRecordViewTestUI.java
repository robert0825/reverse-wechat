package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.plugin.u.a.d;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.MMActivity;

public class MMSightRecordViewTestUI
  extends MMActivity
{
  private int hxC;
  private float hxD;
  private MMSightRecordView idJ;
  
  public MMSightRecordViewTestUI()
  {
    GMTrace.i(20151852335104L, 150143);
    this.hxC = 720;
    this.hxD = 0.67F;
    GMTrace.o(20151852335104L, 150143);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20152254988288L, 150146);
    int i = a.e.nlb;
    GMTrace.o(20152254988288L, 150146);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20151986552832L, 150144);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20150241722368L, 150131);
        MMSightRecordViewTestUI.this.finish();
        GMTrace.o(20150241722368L, 150131);
        return false;
      }
    });
    this.idJ = ((MMSightRecordView)findViewById(a.d.nkN));
    this.idJ.M(this.hxD);
    this.idJ.hU(this.hxC);
    this.idJ.qG(100000);
    this.idJ.nH(e.ghz + "mmsighttest.mp4");
    this.idJ.aOQ();
    this.idJ.aOP();
    this.idJ.mXc.Rs();
    this.idJ.hV(3);
    this.idJ.a(new MMSightRecordView.a() {});
    this.idJ.mXc.startPreview();
    this.idJ.mXc.Rk();
    findViewById(a.d.nkU).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20156281520128L, 150176);
        MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).a(new MMSightRecordView.e()
        {
          public final void WF()
          {
            GMTrace.i(20153328730112L, 150154);
            GMTrace.o(20153328730112L, 150154);
          }
          
          public final void r(Bitmap paramAnonymous2Bitmap)
          {
            GMTrace.i(20153194512384L, 150153);
            if (paramAnonymous2Bitmap != null) {
              ((ImageView)MMSightRecordViewTestUI.this.findViewById(a.d.bGN)).setImageBitmap(paramAnonymous2Bitmap);
            }
            GMTrace.o(20153194512384L, 150153);
          }
        }, true);
        GMTrace.o(20156281520128L, 150176);
      }
    });
    findViewById(a.d.nkR).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20155341996032L, 150169);
        MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.qw();
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20157623697408L, 150186);
            MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).a(new MMSightRecordView.f()
            {
              public final void ce(boolean paramAnonymous3Boolean)
              {
                GMTrace.i(20170374381568L, 150281);
                Toast.makeText(MMSightRecordViewTestUI.this, "record finish, error: " + paramAnonymous3Boolean, 0).show();
                GMTrace.o(20170374381568L, 150281);
              }
            });
            GMTrace.o(20157623697408L, 150186);
          }
        }, 5000L);
        GMTrace.o(20155341996032L, 150169);
      }
    });
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20154805125120L, 150165);
        this.nhF.setText("");
        this.nhF.append(String.format("picture size: %s, ratio: %s\n", new Object[] { MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rm(), Float.valueOf(Math.min(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rm().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rm().y) / Math.max(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rm().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rm().y)) }));
        this.nhF.append(String.format("video size: %s, ratio: %s\n", new Object[] { MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rn(), Float.valueOf(Math.min(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rn().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rn().y) / Math.max(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rn().x, MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.Rn().y)) }));
        this.nhF.append(String.format("preview size limit: %s\n", new Object[] { Integer.valueOf(MMSightRecordViewTestUI.b(MMSightRecordViewTestUI.this)) }));
        this.nhF.append(String.format("display ratio: %s\n", new Object[] { Float.valueOf(MMSightRecordViewTestUI.c(MMSightRecordViewTestUI.this)) }));
        this.nhF.append(String.format("view size: %s, ratio: %s\n", new Object[] { new Point(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getWidth(), MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getHeight()), Float.valueOf(MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getWidth() / MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).getHeight()) }));
        GMTrace.o(20154805125120L, 150165);
      }
    }, 1000L);
    findViewById(a.d.nkT).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20165005672448L, 150241);
        MMSightRecordViewTestUI.a(MMSightRecordViewTestUI.this).mXc.switchCamera();
        GMTrace.o(20165005672448L, 150241);
      }
    });
    GMTrace.o(20151986552832L, 150144);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20152120770560L, 150145);
    super.onDestroy();
    this.idJ.mXc.release();
    GMTrace.o(20152120770560L, 150145);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\MMSightRecordViewTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */