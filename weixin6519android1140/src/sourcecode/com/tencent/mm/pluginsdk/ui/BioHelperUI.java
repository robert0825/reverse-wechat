package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public class BioHelperUI
  extends MMActivity
{
  private String iAx;
  private String jQv;
  private int kwP;
  private int mType;
  private String msr;
  private String tsP;
  private b tsQ;
  
  public BioHelperUI()
  {
    GMTrace.i(1191182336000L, 8875);
    GMTrace.o(1191182336000L, 8875);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1191450771456L, 8877);
    int i = R.i.cqk;
    GMTrace.o(1191450771456L, 8877);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    GMTrace.i(1191584989184L, 8878);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null) {}
    for (;;)
    {
      w.i("MicroMsg.BioHelperUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      this.tsQ.d(paramInt1, paramInt2, paramIntent);
      GMTrace.o(1191584989184L, 8878);
      return;
      bool = false;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Object localObject = null;
    GMTrace.i(1191316553728L, 8876);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("k_type", 1);
    w.i("MicroMsg.BioHelperUI", "hy: starting to bio helper ui, type: %d", new Object[] { Integer.valueOf(this.mType) });
    this.iAx = bg.aq(getIntent().getStringExtra("Kusername"), null);
    this.jQv = bg.aq(getIntent().getStringExtra("Kvertify_key"), null);
    this.tsP = bg.aq(getIntent().getStringExtra("KVoiceHelpUrl"), null);
    this.msr = bg.aq(getIntent().getStringExtra("KVoiceHelpWording"), null);
    this.kwP = getIntent().getIntExtra("KVoiceHelpCode", 0);
    if (this.mType == 0) {
      paramBundle = new c();
    }
    for (;;)
    {
      this.tsQ = paramBundle;
      if ((this.tsQ != null) && (!bg.nm(this.iAx)) && (!bg.nm(this.jQv))) {
        break;
      }
      w.w("MicroMsg.BioHelperUI", "type or username or ticket is null and finish");
      finish();
      GMTrace.o(1191316553728L, 8876);
      return;
      if (this.mType == 1)
      {
        paramBundle = new a();
      }
      else
      {
        w.e("MicroMsg.BioHelperUI", "hy: invalid type!!!");
        paramBundle = (Bundle)localObject;
      }
    }
    paramBundle = (TextView)findViewById(R.h.bhn);
    if (!bg.nm(this.msr)) {
      paramBundle.setText(this.msr);
    }
    for (;;)
    {
      sq(this.tsQ.bKJ());
      ((ImageView)findViewById(R.h.bhl)).setImageResource(this.tsQ.bKK());
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1201248665600L, 8950);
          BioHelperUI.this.finish();
          GMTrace.o(1201248665600L, 8950);
          return true;
        }
      });
      this.tsQ.ad(getIntent());
      paramBundle = (Button)findViewById(R.h.bho);
      paramBundle.setText(this.tsQ.bKL());
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1158835863552L, 8634);
          BioHelperUI.a(BioHelperUI.this).dT(BioHelperUI.this);
          GMTrace.o(1158835863552L, 8634);
        }
      });
      findViewById(R.h.bhm).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1037234601984L, 7728);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", BioHelperUI.b(BioHelperUI.this));
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("show_bottom", false);
          paramAnonymousView.putExtra("needRedirect", false);
          paramAnonymousView.putExtra("neverGetA8Key", true);
          paramAnonymousView.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          paramAnonymousView.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          d.b(BioHelperUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          BioHelperUI.this.finish();
          GMTrace.o(1037234601984L, 7728);
        }
      });
      GMTrace.o(1191316553728L, 8876);
      return;
      paramBundle.setText(this.tsQ.bKM());
    }
  }
  
  private final class a
    implements BioHelperUI.b
  {
    public a()
    {
      GMTrace.i(1198966964224L, 8933);
      GMTrace.o(1198966964224L, 8933);
    }
    
    public final void ad(Intent paramIntent)
    {
      GMTrace.i(1199101181952L, 8934);
      GMTrace.o(1199101181952L, 8934);
    }
    
    public final String bKJ()
    {
      GMTrace.i(1199235399680L, 8935);
      String str = BioHelperUI.this.getString(R.l.daC);
      GMTrace.o(1199235399680L, 8935);
      return str;
    }
    
    public final int bKK()
    {
      GMTrace.i(1199369617408L, 8936);
      int i = R.g.aWs;
      GMTrace.o(1199369617408L, 8936);
      return i;
    }
    
    public final String bKL()
    {
      GMTrace.i(1199503835136L, 8937);
      String str = BioHelperUI.this.getString(R.l.daD);
      GMTrace.o(1199503835136L, 8937);
      return str;
    }
    
    public final String bKM()
    {
      GMTrace.i(1199638052864L, 8938);
      String str = BioHelperUI.this.getString(R.l.daA);
      GMTrace.o(1199638052864L, 8938);
      return str;
    }
    
    public final void d(int paramInt1, int paramInt2, Intent paramIntent)
    {
      paramInt1 = 0;
      GMTrace.i(1199906488320L, 8940);
      boolean bool;
      if ((paramInt2 == 2) && (paramIntent != null))
      {
        BioHelperUI.this.finish();
        paramIntent = paramIntent.getStringExtra("KFaceLoginAuthPwd");
        bool = bg.nm(paramIntent);
        if (!bg.nm(paramIntent)) {
          break label83;
        }
      }
      for (;;)
      {
        w.i("MicroMsg.BioHelperUI", "hy: secondary check onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
        GMTrace.o(1199906488320L, 8940);
        return;
        label83:
        paramInt1 = paramIntent.length();
      }
    }
    
    public final void dT(Context paramContext)
    {
      GMTrace.i(1199772270592L, 8939);
      paramContext = new Intent();
      paramContext.putExtra("k_user_name", BioHelperUI.c(BioHelperUI.this));
      paramContext.putExtra("k_purpose", 2);
      paramContext.putExtra("k_need_signature", true);
      paramContext.putExtra("k_ticket", BioHelperUI.d(BioHelperUI.this));
      d.b(BioHelperUI.this.vKB.vKW, "facedetect", ".ui.FaceDetectUI", paramContext, 1025);
      GMTrace.o(1199772270592L, 8939);
    }
  }
  
  private static abstract interface b
  {
    public abstract void ad(Intent paramIntent);
    
    public abstract String bKJ();
    
    public abstract int bKK();
    
    public abstract String bKL();
    
    public abstract String bKM();
    
    public abstract void d(int paramInt1, int paramInt2, Intent paramIntent);
    
    public abstract void dT(Context paramContext);
  }
  
  private final class c
    implements BioHelperUI.b
  {
    private int gRb;
    
    public c()
    {
      GMTrace.i(1189974376448L, 8866);
      GMTrace.o(1189974376448L, 8866);
    }
    
    public final void ad(Intent paramIntent)
    {
      GMTrace.i(1190108594176L, 8867);
      if (paramIntent == null)
      {
        GMTrace.o(1190108594176L, 8867);
        return;
      }
      this.gRb = paramIntent.getIntExtra("kscene_type", 73);
      GMTrace.o(1190108594176L, 8867);
    }
    
    public final String bKJ()
    {
      GMTrace.i(1190242811904L, 8868);
      String str = BioHelperUI.this.getString(R.l.daF);
      GMTrace.o(1190242811904L, 8868);
      return str;
    }
    
    public final int bKK()
    {
      GMTrace.i(1190377029632L, 8869);
      int i = R.g.bbr;
      GMTrace.o(1190377029632L, 8869);
      return i;
    }
    
    public final String bKL()
    {
      GMTrace.i(1190511247360L, 8870);
      String str = BioHelperUI.this.getString(R.l.daE);
      GMTrace.o(1190511247360L, 8870);
      return str;
    }
    
    public final String bKM()
    {
      GMTrace.i(1190645465088L, 8871);
      String str = BioHelperUI.this.getString(R.l.daB);
      GMTrace.o(1190645465088L, 8871);
      return str;
    }
    
    public final void d(int paramInt1, int paramInt2, Intent paramIntent)
    {
      int i = 0;
      GMTrace.i(1190913900544L, 8873);
      boolean bool;
      if (paramInt2 == -1) {
        if ((paramInt1 == 1024) && (paramIntent != null))
        {
          paramIntent = paramIntent.getStringExtra("VoiceLoginAuthPwd");
          bool = bg.nm(paramIntent);
          if (!bg.nm(paramIntent)) {
            break label137;
          }
        }
      }
      label137:
      for (paramInt1 = i;; paramInt1 = paramIntent.length())
      {
        w.d("MicroMsg.BioHelperUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
        Intent localIntent = new Intent();
        localIntent.putExtra("VoiceLoginAuthPwd", paramIntent);
        localIntent.putExtra("KVoiceHelpCode", BioHelperUI.e(BioHelperUI.this));
        BioHelperUI.this.setResult(-1, localIntent);
        BioHelperUI.this.finish();
        GMTrace.o(1190913900544L, 8873);
        return;
      }
    }
    
    public final void dT(Context paramContext)
    {
      GMTrace.i(1190779682816L, 8872);
      Intent localIntent = new Intent();
      localIntent.putExtra("kscene_type", this.gRb);
      localIntent.putExtra("Kusername", BioHelperUI.c(BioHelperUI.this));
      localIntent.putExtra("Kvertify_key", BioHelperUI.d(BioHelperUI.this));
      d.b(paramContext, "voiceprint", ".ui.VoiceLoginUI", localIntent, 1024);
      GMTrace.o(1190779682816L, 8872);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\BioHelperUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */