package com.tencent.mm.pluginsdk.ui.applet;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import java.util.LinkedList;

public final class b
  implements d.a, a.a, m
{
  private String fUL;
  private int gRb;
  public String iAx;
  public ProgressDialog kgz;
  public x kse;
  public Context mContext;
  public com.tencent.mm.ad.e twA;
  private boolean twB;
  private l twy;
  public i twz;
  
  public b(Context paramContext, String paramString, int paramInt, l paraml)
  {
    this(paramContext, paramString, 0, paraml, true, "");
    GMTrace.i(20405523841024L, 152033);
    GMTrace.o(20405523841024L, 152033);
  }
  
  public b(Context paramContext, String paramString1, int paramInt, l paraml, String paramString2)
  {
    this(paramContext, paramString1, paramInt, paraml, true, paramString2);
    GMTrace.i(20405658058752L, 152034);
    GMTrace.o(20405658058752L, 152034);
  }
  
  public b(Context paramContext, String paramString1, int paramInt, l paraml, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(20405792276480L, 152035);
    this.twA = null;
    this.twB = true;
    this.mContext = paramContext;
    this.iAx = paramString1;
    this.gRb = paramInt;
    this.twy = paraml;
    this.twB = paramBoolean;
    this.fUL = paramString2;
    GMTrace.o(20405792276480L, 152035);
  }
  
  private void Pe(String paramString)
  {
    GMTrace.i(936571305984L, 6978);
    w.i("MicroMsg.AddContactDialog", "searchContact %s", new Object[] { paramString });
    if (this.twA == null) {
      this.twA = new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(965293899776L, 7192);
          if (b.this.kgz != null) {
            b.this.kgz.dismiss();
          }
          if (b.this.twA != null)
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.b(106, b.this.twA);
          }
          if (b.this.kgz == null)
          {
            w.e("MicroMsg.AddContactDialog", "has cancel the loading dialog");
            b.this.eD(0);
            GMTrace.o(965293899776L, 7192);
            return;
          }
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.AddContactDialog", "searchContact onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            b.this.eD(-1);
            GMTrace.o(965293899776L, 7192);
            return;
          }
          if (b.this.mContext == null)
          {
            w.e("MicroMsg.AddContactDialog", "searchContact, context is null, msghandler has already been detached!");
            b.this.eD(-1);
            GMTrace.o(965293899776L, 7192);
            return;
          }
          if (((b.this.mContext instanceof Activity)) && (((Activity)b.this.mContext).isFinishing()))
          {
            w.e("MicroMsg.AddContactDialog", "searchContact, context isFinishing");
            b.this.eD(-1);
            GMTrace.o(965293899776L, 7192);
            return;
          }
          paramAnonymousString = ((ab)paramAnonymousk).LK();
          paramAnonymousk = com.tencent.mm.platformtools.n.a(paramAnonymousString.ufy);
          if (bg.nm(paramAnonymousk))
          {
            w.e("MicroMsg.AddContactDialog", "searchContact, user is null");
            com.tencent.mm.ui.base.h.bm(b.this.mContext, b.this.mContext.getResources().getString(R.l.elv));
            b.this.eD(-1);
            GMTrace.o(965293899776L, 7192);
            return;
          }
          if ((b.this.iAx == null) || (!b.this.iAx.equals(paramAnonymousk))) {
            w.w("MicroMsg.AddContactDialog", "user not the same, %s, %s", new Object[] { b.this.iAx, paramAnonymousk });
          }
          b localb = b.this;
          com.tencent.mm.kernel.h.xz();
          localb.kse = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymousk);
          if ((b.this.kse == null) || ((int)b.this.kse.fTq == 0))
          {
            w.i("MicroMsg.AddContactDialog", "searchContact, no contact with username = " + paramAnonymousk + ", try get by alias");
            localb = b.this;
            com.tencent.mm.kernel.h.xz();
            localb.kse = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TB(paramAnonymousk);
            if ((b.this.kse == null) || ((int)b.this.kse.fTq == 0))
            {
              w.i("MicroMsg.AddContactDialog", "searchContact, no contact with alias, new Contact");
              b.this.kse = new x(paramAnonymousk);
              b.this.kse.ci(paramAnonymousString.gCC);
              b.this.kse.cl(com.tencent.mm.platformtools.n.a(paramAnonymousString.uxT));
              b.this.kse.cm(com.tencent.mm.platformtools.n.a(paramAnonymousString.ufo));
              b.this.kse.cn(com.tencent.mm.platformtools.n.a(paramAnonymousString.ufp));
              b.this.kse.jdMethod_do(paramAnonymousString.gCx);
              b.this.kse.cE(RegionCodeDecoder.ai(paramAnonymousString.gCG, paramAnonymousString.gCy, paramAnonymousString.gCz));
              b.this.kse.cy(paramAnonymousString.gCA);
              b.this.kse.dk(paramAnonymousString.uAv);
              b.this.kse.cD(paramAnonymousString.uAw);
              b.this.kse.dj(paramAnonymousString.uAz);
              b.this.kse.co(paramAnonymousString.uAy);
              b.this.kse.cC(paramAnonymousString.uAx);
            }
          }
          for (;;)
          {
            b.this.M(b.this.kse);
            GMTrace.o(965293899776L, 7192);
            return;
            w.i("MicroMsg.AddContactDialog", "searchContact, contact in db, %s", new Object[] { paramAnonymousk });
          }
        }
      };
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(106, this.twA);
    paramString = new ab(paramString);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramString, 0);
    GMTrace.o(936571305984L, 6978);
  }
  
  public final void M(final x paramx)
  {
    GMTrace.i(936168652800L, 6975);
    if (paramx == null)
    {
      w.e("MicroMsg.AddContactDialog", "showContact fail, contact is null");
      eD(-1);
      GMTrace.o(936168652800L, 6975);
      return;
    }
    Object localObject1 = this.mContext.getString(R.l.elu);
    Bitmap localBitmap = com.tencent.mm.ac.b.a(paramx.field_username, false, -1);
    if (localBitmap == null) {
      com.tencent.mm.ac.n.Dh().a(this);
    }
    if ((localBitmap != null) && (paramx.bSA())) {
      localBitmap = com.tencent.mm.sdk.platformtools.d.a(localBitmap, false, localBitmap.getWidth() / 2);
    }
    for (;;)
    {
      String str = paramx.field_nickname;
      this.twz = null;
      p localp;
      int i;
      if ((this.mContext instanceof MMActivity))
      {
        if (!this.twB)
        {
          N(paramx);
          GMTrace.o(936168652800L, 6975);
          return;
        }
        localp = ((MMActivity)this.mContext).vKB;
        i = R.l.diL;
        paramx.bSA();
        localObject2 = new o.a()
        {
          public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(946771853312L, 7054);
            if (paramAnonymousBoolean) {
              b.this.N(paramx);
            }
            for (;;)
            {
              b.this.twz.dismiss();
              GMTrace.o(946771853312L, 7054);
              return;
              b.this.eD(0);
            }
          }
        };
        if (((localObject1 == null) || (((String)localObject1).length() == 0)) && ((str == null) || (str.length() == 0)))
        {
          w.e("MicroMsg.MMConfirmDialog", "showDialogItem6 fail, title message both are empty");
          paramx = null;
          this.twz = paramx;
        }
      }
      else
      {
        if (this.twz == null)
        {
          w.e("MicroMsg.AddContactDialog", "showContact fail, cannot show dialog");
          eD(-1);
        }
        GMTrace.o(936168652800L, 6975);
        return;
      }
      paramx = e.Q(localp.vKW, R.i.ctC);
      i.a locala = new i.a(localp.vKW);
      locala.lz(false);
      locala.lA(false);
      e.m(paramx, false);
      e.a(localp, locala, (o.a)localObject2, paramx, localp.vKW.getResources().getString(i));
      Object localObject2 = (TextView)paramx.findViewById(R.h.bqc);
      ((TextView)localObject2).setText(com.tencent.mm.pluginsdk.ui.d.h.b(localp.vKW, (CharSequence)localObject1, ((TextView)localObject2).getTextSize()));
      localObject1 = (TextView)paramx.findViewById(R.h.bpZ);
      ((TextView)localObject1).setText(com.tencent.mm.pluginsdk.ui.d.h.b(localp.vKW, str, ((TextView)localObject1).getTextSize()));
      if ("".length() == 0)
      {
        paramx.findViewById(R.h.bpW).setVisibility(8);
        label387:
        localObject1 = (ImageView)paramx.findViewById(R.h.bqb);
        if (localObject1 != null)
        {
          if ((localBitmap == null) || (localBitmap.isRecycled())) {
            break label465;
          }
          ((ImageView)localObject1).setImageBitmap(localBitmap);
          e.a(locala, localBitmap);
        }
      }
      for (;;)
      {
        locala.dg(paramx);
        paramx = locala.aax();
        paramx.show();
        break;
        ((TextView)paramx.findViewById(R.h.bpW)).setText("");
        break label387;
        label465:
        ((ImageView)localObject1).setVisibility(4);
      }
    }
  }
  
  public final void N(x paramx)
  {
    GMTrace.i(936302870528L, 6976);
    if (this.kgz != null) {
      this.kgz.dismiss();
    }
    Object localObject = this.mContext;
    this.mContext.getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a((Context)localObject, this.mContext.getString(R.l.elw), true, null);
    localObject = new a(this.mContext, this);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(this.gRb));
    ((a)localObject).a(paramx.field_username, localLinkedList, this.fUL);
    GMTrace.o(936302870528L, 6976);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    GMTrace.i(936705523712L, 6979);
    if (this.kgz != null) {
      this.kgz.dismiss();
    }
    if (paramBoolean1)
    {
      this.kse.uA();
      com.tencent.mm.kernel.h.xz();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this.kse.field_username, this.kse);
      com.tencent.mm.ui.base.h.bm(this.mContext, this.mContext.getResources().getString(R.l.elz));
      eD(1);
      GMTrace.o(936705523712L, 6979);
      return;
    }
    eD(-1);
    GMTrace.o(936705523712L, 6979);
  }
  
  public final void eD(int paramInt)
  {
    GMTrace.i(936839741440L, 6980);
    if (this.twy != null) {
      this.twy.qg(paramInt);
    }
    GMTrace.o(936839741440L, 6980);
  }
  
  public final void ib(String paramString)
  {
    int j = 1;
    GMTrace.i(936437088256L, 6977);
    if (this.kse != null)
    {
      int i;
      if ((this.kse.field_username != null) && (this.kse.field_username.equals(paramString)))
      {
        i = 1;
        if ((this.kse.qQ() == null) || (!this.kse.qQ().equals(paramString))) {
          break label91;
        }
      }
      for (;;)
      {
        if ((i != 0) || (j != 0)) {
          break label124;
        }
        GMTrace.o(936437088256L, 6977);
        return;
        i = 0;
        break;
        label91:
        j = 0;
      }
    }
    if ((this.iAx == null) || (!this.iAx.equals(paramString)))
    {
      GMTrace.o(936437088256L, 6977);
      return;
    }
    label124:
    if ((this.twz == null) || (!this.twz.isShowing()))
    {
      GMTrace.o(936437088256L, 6977);
      return;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(959522537472L, 7149);
        ImageView localImageView = (ImageView)b.this.twz.getContentView().findViewById(R.h.bqb);
        if (localImageView != null)
        {
          Bitmap localBitmap2 = com.tencent.mm.ac.b.a(b.this.kse.field_username, false, -1);
          Bitmap localBitmap1 = localBitmap2;
          if (localBitmap2 != null)
          {
            localBitmap1 = localBitmap2;
            if (b.this.kse.bSA()) {
              localBitmap1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap2, false, localBitmap2.getWidth() / 2);
            }
          }
          if ((localBitmap1 != null) && (!localBitmap1.isRecycled()))
          {
            localImageView.setImageBitmap(localBitmap1);
            localImageView.setVisibility(0);
          }
        }
        GMTrace.o(959522537472L, 7149);
      }
    });
    GMTrace.o(936437088256L, 6977);
  }
  
  public final void show()
  {
    GMTrace.i(936034435072L, 6974);
    com.tencent.mm.kernel.h.xz();
    this.kse = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.iAx);
    if ((this.kse != null) && ((int)this.kse.fTq <= 0))
    {
      w.i("MicroMsg.AddContactDialog", "dealAddContact get by username fail, try alias, %s", new Object[] { this.iAx });
      com.tencent.mm.kernel.h.xz();
      this.kse = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TB(this.iAx);
    }
    if ((this.kse != null) && ((int)this.kse.fTq > 0))
    {
      w.i("MicroMsg.AddContactDialog", "The contact already exists, so go to dealAddContact.");
      if (this.kse == null)
      {
        w.e("MicroMsg.AddContactDialog", "dealAddContact fail, contact is null");
        eD(-1);
        GMTrace.o(936034435072L, 6974);
        return;
      }
      localObject1 = this.kse.field_username;
      if (!this.kse.bSA())
      {
        if (((com.tencent.mm.api.h)com.tencent.mm.kernel.h.h(com.tencent.mm.api.h.class)).bn((String)localObject1))
        {
          localObject2 = this.mContext;
          this.mContext.getString(R.l.cUG);
          this.kgz = com.tencent.mm.ui.base.h.a((Context)localObject2, this.mContext.getString(R.l.elw), true, null);
          Pe((String)localObject1);
          GMTrace.o(936034435072L, 6974);
          return;
        }
        Object localObject2 = BitmapFactory.decodeResource(this.mContext.getResources(), R.g.aVQ);
        p localp;
        o.a local5;
        View localView;
        if ((this.mContext instanceof MMActivity))
        {
          localp = ((MMActivity)this.mContext).vKB;
          localObject3 = this.mContext.getResources().getString(R.l.elB);
          local5 = new o.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(946503417856L, 7052);
              w.e("MicroMsg.AddContactDialog", "doAddContact fail, contact not biz");
              b.this.eD(-1);
              GMTrace.o(946503417856L, 7052);
            }
          };
          localView = e.Q(localp.vKW, R.i.ctD);
          localObject1 = e.cR(localView);
          e.a(localView, local5, (q)localObject1);
          if (!bg.nm((String)localObject3)) {
            break label382;
          }
          w.e("MicroMsg.MMConfirmDialog", "showDialogItem7 fail, message is empty");
          localObject1 = null;
          if (localObject1 == null)
          {
            w.e("MicroMsg.AddContactDialog", "dealAddContact fail, connot show dialog");
            eD(-1);
          }
        }
        GMTrace.o(936034435072L, 6974);
        return;
        label382:
        Object localObject4 = (TextView)localView.findViewById(R.h.bpZ);
        ((TextView)localObject4).setText(com.tencent.mm.pluginsdk.ui.d.h.b(localp.vKW, (CharSequence)localObject3, ((TextView)localObject4).getTextSize()));
        Object localObject3 = (Button)localView.findViewById(R.h.bpS);
        localObject4 = (ImageView)localView.findViewById(R.h.bqb);
        if (localObject4 != null)
        {
          if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
            break label499;
          }
          ((ImageView)localObject4).setImageBitmap((Bitmap)localObject2);
          ((q)localObject1).setOnDismissListener(new e.6((Bitmap)localObject2));
        }
        for (;;)
        {
          ((Button)localObject3).setOnClickListener(new e.10(local5, localView, (q)localObject1));
          e.a(localp, (q)localObject1);
          break;
          label499:
          ((ImageView)localObject4).setVisibility(8);
        }
      }
      if (com.tencent.mm.l.a.eE(this.kse.field_type))
      {
        com.tencent.mm.ui.base.h.bm(this.mContext, this.mContext.getResources().getString(R.l.elz));
        eD(-2);
        GMTrace.o(936034435072L, 6974);
        return;
      }
      M(this.kse);
      GMTrace.o(936034435072L, 6974);
      return;
    }
    Object localObject1 = this.mContext;
    this.mContext.getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a((Context)localObject1, this.mContext.getString(R.l.elw), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(934960693248L, 6966);
        if (b.this.kgz != null)
        {
          b.this.kgz.dismiss();
          b.this.kgz = null;
        }
        GMTrace.o(934960693248L, 6966);
      }
    });
    Pe(this.iAx);
    GMTrace.o(936034435072L, 6974);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */