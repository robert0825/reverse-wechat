package com.tencent.mm.plugin.mmsight.segment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.plugin.u.a.f;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class MMSightEditUI
  extends MMActivity
{
  private String eIy;
  private com.tencent.mm.remoteservice.d kSj;
  private VideoTransPara mYw;
  private VideoSeekBarEditorView ndA;
  private com.tencent.mm.plugin.mmsight.ui.a ndB;
  private String ndC;
  private boolean ndD;
  private boolean ndE;
  private f.a ndF;
  private ViewGroup ndy;
  private VideoPlayerTextureView ndz;
  private String videoPath;
  
  public MMSightEditUI()
  {
    GMTrace.i(20174803566592L, 150314);
    this.kSj = new com.tencent.mm.remoteservice.d(ab.getContext());
    this.ndD = false;
    this.ndE = false;
    this.ndF = new f.a()
    {
      public final void Xq()
      {
        GMTrace.i(20177487921152L, 150334);
        if (MMSightEditUI.h(MMSightEditUI.this) != null)
        {
          MMSightEditUI.h(MMSightEditUI.this).start();
          MMSightEditUI.h(MMSightEditUI.this);
          MMSightEditUI.h(MMSightEditUI.this).setAlpha(1.0F);
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20177085267968L, 150331);
              MMSightEditUI.i(MMSightEditUI.this);
              GMTrace.o(20177085267968L, 150331);
            }
          }, 300L);
        }
        GMTrace.o(20177487921152L, 150334);
      }
      
      public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20177756356608L, 150336);
        GMTrace.o(20177756356608L, 150336);
        return 0;
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20177890574336L, 150337);
        GMTrace.o(20177890574336L, 150337);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(20177622138880L, 150335);
        MMSightEditUI.h(MMSightEditUI.this).c(0.0D, true);
        GMTrace.o(20177622138880L, 150335);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20177353703424L, 150333);
        w.e("MicroMsg.MMSightEditUI", "%d on error what %d extra %d", new Object[] { Integer.valueOf(MMSightEditUI.this.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        GMTrace.o(20177353703424L, 150333);
      }
    };
    GMTrace.o(20174803566592L, 150314);
  }
  
  protected final int Qf()
  {
    GMTrace.i(20175206219776L, 150317);
    GMTrace.o(20175206219776L, 150317);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20175072002048L, 150316);
    int i = a.e.nld;
    GMTrace.o(20175072002048L, 150316);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(20175340437504L, 150318);
    if ((this.ndB != null) && (this.ndB.Yb()))
    {
      GMTrace.o(20175340437504L, 150318);
      return;
    }
    super.onBackPressed();
    GMTrace.o(20175340437504L, 150318);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20174937784320L, 150315);
    aq(1);
    super.onCreate(paramBundle);
    getWindow().addFlags(2097280);
    if (com.tencent.mm.compatible.util.d.et(19))
    {
      getWindow().setFlags(201327616, 201327616);
      com.tencent.mm.plugin.mmsight.d.fV(true);
    }
    for (;;)
    {
      CaptureMMProxy.createProxy(new CaptureMMProxy(this.kSj));
      final long l = bg.Pw();
      this.kSj.C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20174535131136L, 150312);
          w.i("MicroMsg.MMSightEditUI", "connect cost %sms", new Object[] { Long.valueOf(bg.aI(l)) });
          if (CaptureMMProxy.getInstance() != null) {
            p.dO(CaptureMMProxy.getInstance().getDeviceInfoConfig());
          }
          MMSightEditUI.a(MMSightEditUI.this);
          GMTrace.o(20174535131136L, 150312);
        }
      });
      GMTrace.o(20174937784320L, 150315);
      return;
      getWindow().setFlags(1024, 1024);
      com.tencent.mm.plugin.mmsight.d.fV(false);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20175474655232L, 150319);
    super.onDestroy();
    if (this.ndB != null)
    {
      if (this.ndE) {
        com.tencent.mm.plugin.mmsight.a.a.a(new com.tencent.mm.plugin.mmsight.a.a.a(this.ndB.scene));
      }
      this.ndB.release();
    }
    GMTrace.o(20175474655232L, 150319);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\MMSightEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */