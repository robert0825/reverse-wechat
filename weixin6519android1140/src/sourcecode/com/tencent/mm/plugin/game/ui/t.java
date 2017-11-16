package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.game.c.cg;
import com.tencent.mm.plugin.game.model.ag;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.y.at;

public final class t
  implements View.OnClickListener, e
{
  public com.tencent.mm.plugin.game.model.c lMw;
  public int lNQ;
  public Context mContext;
  DialogInterface.OnClickListener mcS;
  
  public t(Context paramContext)
  {
    GMTrace.i(12694581149696L, 94582);
    this.lMw = null;
    this.mcS = null;
    this.mContext = paramContext;
    GMTrace.o(12694581149696L, 94582);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(12694849585152L, 94584);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk.getType() == 1219))
    {
      at.wS().b(1219, this);
      paramk = new ag(((ax)paramk).kzP.gtD.gtK);
      paramString = new b();
      paramString.mcW = Boolean.valueOf(paramk.lOr.lPp);
      paramString.title = paramk.lOr.eBt;
      paramString.content = paramk.lOr.lPJ;
      if (paramk.lOr.lSV != null)
      {
        paramString.mcX = new a();
        paramString.mcX.message = paramk.lOr.lSV.lPJ;
        paramString.mcX.mcU = paramk.lOr.lSV.lPK;
        paramString.mcX.mcV = paramk.lOr.lSV.lPL;
        paramString.mcX.url = paramk.lOr.lSV.lPM;
      }
      this.lMw.lLA = paramString.mcW.booleanValue();
      if (bg.nm(paramString.title))
      {
        GMTrace.o(12694849585152L, 94584);
        return;
      }
      if (paramString.mcX != null)
      {
        paramk = paramString.mcX.url;
        i.a locala = new i.a(this.mContext);
        locala.Vz(paramString.title);
        locala.VA(paramString.mcX.message);
        locala.lz(false);
        locala.VC(paramString.mcX.mcU).a(true, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12770145730560L, 95145);
            com.tencent.mm.plugin.game.d.c.aa(t.this.mContext, paramk);
            ai.a(t.this.mContext, t.this.lMw.scene, t.this.lMw.eSa, t.this.lMw.position, 17, t.this.lMw.field_appId, t.this.lNQ, t.this.lMw.eBv, t.this.lMw.lLN);
            GMTrace.o(12770145730560L, 95145);
          }
        });
        locala.VD(paramString.mcX.mcV).b(this.mcS);
        locala.aax().show();
        GMTrace.o(12694849585152L, 94584);
        return;
      }
      if (bg.nm(paramString.content))
      {
        GMTrace.o(12694849585152L, 94584);
        return;
      }
      paramk = new i.a(this.mContext);
      paramk.Vz(paramString.title);
      paramk.VA(paramString.content);
      paramk.lz(false);
      paramk.BQ(R.l.dAP).a(this.mcS);
      paramk.aax().show();
      GMTrace.o(12694849585152L, 94584);
      return;
    }
    paramString = new i.a(this.mContext);
    paramString.BO(R.l.dAQ);
    paramString.BQ(R.l.dAP);
    paramString.aax().show();
    GMTrace.o(12694849585152L, 94584);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12694715367424L, 94583);
    if (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      w.e("MicroMsg.GameSubscriptionClickListener", "No GameAppInfo");
      GMTrace.o(12694715367424L, 94583);
      return;
    }
    this.lMw = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
    w.i("MicroMsg.GameSubscriptionClickListener", "Clicked appid = " + this.lMw.field_appId);
    at.wS().a(1219, this);
    paramView = v.bPK();
    paramView = new ax(this.lMw.field_appId, paramView, this.lMw.eBv, this.lMw.lLI);
    at.wS().a(paramView, 0);
    GMTrace.o(12694715367424L, 94583);
  }
  
  public static final class a
  {
    public String mcU;
    public String mcV;
    public String message;
    public String url;
    
    public a()
    {
      GMTrace.i(12758334570496L, 95057);
      GMTrace.o(12758334570496L, 95057);
    }
  }
  
  public static final class b
  {
    public String content;
    public Boolean mcW;
    public t.a mcX;
    public String title;
    
    public b()
    {
      GMTrace.i(12697131286528L, 94601);
      GMTrace.o(12697131286528L, 94601);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */