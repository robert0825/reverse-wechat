package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.b.d.1;
import com.tencent.mm.plugin.ipcall.a.b.d.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.e;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class j
  implements b.a, e
{
  ImageView hqg;
  TextView hql;
  String lTY;
  DialPad mnl;
  String mpH;
  String mpI;
  String mpJ;
  String mpK;
  int mpL;
  int mpM;
  Bitmap mtM;
  public EditText mtV;
  TextView mtW;
  ImageView mtX;
  IPCallFuncButton mtY;
  IPCallFuncButton mtZ;
  IPCallFuncButton mua;
  ImageButton mub;
  public TextView muc;
  public View mud;
  ImageButton mue;
  int muf;
  String mug;
  public IPCallTalkUI muh;
  public com.tencent.mm.plugin.ipcall.c mui;
  a muj;
  private long muk;
  public long mul;
  public boolean mum;
  public boolean mun;
  private AudioManager muo;
  boolean mup;
  private boolean muq;
  boolean mur;
  
  public j(IPCallTalkUI paramIPCallTalkUI)
  {
    GMTrace.i(11700833091584L, 87178);
    this.muf = -1;
    this.mul = -1L;
    this.mum = false;
    this.mun = false;
    this.muo = null;
    this.mup = false;
    this.muq = true;
    this.mur = false;
    this.muh = paramIPCallTalkUI;
    this.mui = i.aIt();
    this.mui.mig = this;
    GMTrace.o(11700833091584L, 87178);
  }
  
  private void c(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(11700967309312L, 87179);
    aJA();
    if (!bg.nm(paramString1)) {}
    for (;;)
    {
      if ((2 == paramInt) && (paramString2 != null))
      {
        this.hql.setText(paramString2);
        GMTrace.o(11700967309312L, 87179);
        return;
        if (bg.nm(paramString3)) {
          paramString1 = this.muh.getString(R.l.dEb);
        }
      }
      else
      {
        if ((1 == paramInt) && (paramString2 != null)) {
          com.tencent.mm.ui.base.h.a(this.muh, paramString2, paramString1, this.muh.getString(R.l.dEc), false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(11655870152704L, 86843);
              j.this.muh.finish();
              GMTrace.o(11655870152704L, 86843);
            }
          });
        }
        GMTrace.o(11700967309312L, 87179);
        return;
      }
      paramString1 = paramString3;
    }
  }
  
  final void AF(String paramString)
  {
    GMTrace.i(11701369962496L, 87182);
    if (!bg.nm(this.lTY))
    {
      cG(this.lTY, com.tencent.mm.plugin.ipcall.b.a.AP(paramString));
      GMTrace.o(11701369962496L, 87182);
      return;
    }
    cG(com.tencent.mm.plugin.ipcall.b.a.AP(paramString), "");
    GMTrace.o(11701369962496L, 87182);
  }
  
  public final void aHF()
  {
    int j = 0;
    GMTrace.i(11701772615680L, 87185);
    w.i("MicroMsg.TalkUIController", "onInviteSuccess");
    String str1 = i.aIo().miY.mkh;
    String str2 = i.aIo().miY.mki;
    if ((!bg.nm(str1)) && (!bg.nm(str2)) && (!str1.equals(str2)))
    {
      w.i("MicroMsg.TalkUIController", "toPhoneNumber:%s,serverRetPhoneNumber:%s", new Object[] { str1, str2 });
      AF(str2);
    }
    w.i("MicroMsg.TalkUIController", "callFlag:" + i.aIo().miY.mjV);
    int k = i.aIo().miY.mjV;
    int i = j;
    if ((k & 0x1) > 0)
    {
      i = j;
      if ((k & 0x2) > 0)
      {
        i = j;
        if ((k & 0x8) <= 0) {
          i = 1;
        }
      }
    }
    if (i != 0)
    {
      w.i("MicroMsg.TalkUIController", "isNotFree");
      com.tencent.mm.ui.base.h.a(this.muh, R.l.dFd, R.l.dFe, R.l.dFc, R.l.dFb, true, null, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11670768320512L, 86954);
          w.i("MicroMsg.TalkUIController", "user choose end this call because isNotFree");
          j.this.aJz();
          GMTrace.o(11670768320512L, 86954);
        }
      });
    }
    pC(3);
    GMTrace.o(11701772615680L, 87185);
  }
  
  public final void aHG()
  {
    GMTrace.i(11701906833408L, 87186);
    w.d("MicroMsg.TalkUIController", "onStartRing");
    if (i.aIs().aIj())
    {
      this.mum = this.mua.isChecked();
      this.mun = this.mua.isChecked();
      i.aIr().fn(this.mua.isChecked());
    }
    GMTrace.o(11701906833408L, 87186);
  }
  
  public final void aHU()
  {
    GMTrace.i(11702041051136L, 87187);
    w.d("MicroMsg.TalkUIController", "onUserAccept");
    if (i.aIs().aIj())
    {
      this.mum = this.mua.isChecked();
      this.mun = this.mua.isChecked();
      i.aIr().fn(this.mua.isChecked());
    }
    if (i.aIs().aIk()) {
      i.aIr().mkt.setMute(this.mtY.isChecked());
    }
    GMTrace.o(11702041051136L, 87187);
  }
  
  public final void aHV()
  {
    GMTrace.i(11702175268864L, 87188);
    w.d("MicroMsg.TalkUIController", "onOthersideShutdown");
    aJA();
    pC(10);
    at.getNotification().cancel(42);
    if (this.muj != null) {
      this.muj.fy(true);
    }
    GMTrace.o(11702175268864L, 87188);
  }
  
  public final void aHW()
  {
    GMTrace.i(11702846357504L, 87193);
    this.muh.finish();
    GMTrace.o(11702846357504L, 87193);
  }
  
  public final void aHX()
  {
    GMTrace.i(11702712139776L, 87192);
    this.muk = i.aIt().aHQ();
    pC(5);
    GMTrace.o(11702712139776L, 87192);
  }
  
  public final void aJA()
  {
    GMTrace.i(11702980575232L, 87194);
    if (this.muc != null) {
      this.muc.setVisibility(4);
    }
    if (this.mud != null) {
      this.mud.setVisibility(4);
    }
    GMTrace.o(11702980575232L, 87194);
  }
  
  final void aJx()
  {
    GMTrace.i(11701101527040L, 87180);
    i.aIr().ezR = this.muh;
    Object localObject = i.aIr();
    ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mku.mkL = ((d.a)localObject);
    localObject = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mku;
    if (!((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrf.vkU)
    {
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrf.a((SensorController.a)localObject);
      d.1 local1 = new d.1((com.tencent.mm.plugin.ipcall.a.b.d)localObject);
      if (!((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrj.J(local1)) {
        break label103;
      }
    }
    label103:
    for (((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrk = 0L;; ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).jrk = -1L)
    {
      i.aIr().mky = this;
      i.aIr().a(this);
      GMTrace.o(11701101527040L, 87180);
      return;
    }
  }
  
  final void aJy()
  {
    GMTrace.i(11701235744768L, 87181);
    this.mtV.setKeyListener(null);
    this.mtV.setHorizontallyScrolling(true);
    this.mnl.setVisibility(4);
    DialPad localDialPad = this.mnl;
    localDialPad.mnd = true;
    Iterator localIterator = localDialPad.mng.values().iterator();
    while (localIterator.hasNext()) {
      ((DialNumberButton)localIterator.next()).ft(true);
    }
    localIterator = localDialPad.mni.values().iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      if (localDialPad.mnd) {
        localView.setBackgroundDrawable(localDialPad.getResources().getDrawable(R.e.aPf));
      } else {
        localView.setBackgroundDrawable(localDialPad.getResources().getDrawable(R.e.aNv));
      }
    }
    if (!bg.nm(this.mug)) {
      AF(this.mug);
    }
    if (com.tencent.mm.compatible.util.d.et(16))
    {
      this.mtV.setTypeface(Typeface.create("sans-serif-light", 0));
      this.mtW.setTypeface(Typeface.create("sans-serif-light", 0));
    }
    if (!bg.nm(this.mpI)) {
      this.mtM = com.tencent.mm.plugin.ipcall.b.a.f(this.muh, this.mpI, true);
    }
    if ((this.mtM == null) && (!bg.nm(this.mpH)) && (com.tencent.mm.plugin.ipcall.b.a.Hr())) {
      this.mtM = com.tencent.mm.plugin.ipcall.b.a.al(this.muh, this.mpH);
    }
    if ((this.mtM == null) && (!bg.nm(this.mpK))) {
      this.mtM = com.tencent.mm.ac.b.c(this.mpK, 480, 480, 4);
    }
    if (this.mtM == null)
    {
      this.mtX.setVisibility(0);
      this.hqg.setVisibility(8);
    }
    if (this.mtM != null)
    {
      this.mtX.setVisibility(8);
      this.hqg.setVisibility(0);
      this.hqg.setImageBitmap(this.mtM);
    }
    this.mue.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View arg1)
      {
        GMTrace.i(11662446821376L, 86892);
        com.tencent.mm.plugin.ipcall.c localc = i.aIt();
        synchronized (localc.laY)
        {
          if (i.aIs().aIi())
          {
            if (localc.mip)
            {
              localc.aHO();
              GMTrace.o(11662446821376L, 86892);
              return;
            }
            localc.mip = true;
            Toast.makeText(ab.getContext(), R.l.dJY, 0).show();
            Intent localIntent = new Intent();
            localIntent.setFlags(268435456);
            localIntent.setClass(ab.getContext(), IPCallTalkUI.class);
            localIntent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
            com.tencent.mm.plugin.voip.model.d.btH().a(localIntent, localc.miq);
            localc.aHO();
            if (localc.mig != null) {
              localc.mig.aHW();
            }
          }
          GMTrace.o(11662446821376L, 86892);
          return;
        }
      }
    });
    this.mua.mqL = new IPCallFuncButton.a()
    {
      public final void fw(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11686606012416L, 87072);
        w.d("MicroMsg.TalkUIController", "switch speaker, isChecked: %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (i.aIs().aIj())
        {
          j.this.mum = paramAnonymousBoolean;
          j.this.mun = paramAnonymousBoolean;
          i.aIr().fn(paramAnonymousBoolean);
          com.tencent.mm.plugin.report.service.g.ork.i(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(11686606012416L, 87072);
          return;
        }
        if ((!i.aIy().bwb()) && (!i.aIs().aIl())) {
          i.aIy().iG(paramAnonymousBoolean);
        }
        GMTrace.o(11686606012416L, 87072);
      }
    };
    this.mtY.mqL = new IPCallFuncButton.a()
    {
      public final void fw(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11675868594176L, 86992);
        com.tencent.mm.plugin.ipcall.a.c.a locala;
        if (i.aIs().aIk())
        {
          w.d("MicroMsg.TalkUIController", "switch mute, isChecked: %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          locala = i.aIp();
          if (!paramAnonymousBoolean) {
            break label139;
          }
        }
        label139:
        for (int i = locala.mkO.qZ(412);; i = locala.mkO.qZ(413))
        {
          if (i < 0) {
            w.e("MicroMsg.IPCallEngineManager", "tryMuteMicrophone ret:" + i);
          }
          i.aIr().mkt.setMute(paramAnonymousBoolean);
          com.tencent.mm.plugin.report.service.g.ork.i(12057, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(11675868594176L, 86992);
          return;
        }
      }
    };
    this.mtZ.mqL = new IPCallFuncButton.a()
    {
      public final void fw(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11623255244800L, 86600);
        if (paramAnonymousBoolean)
        {
          localj = j.this;
          if (localj.mtM == null) {
            localj.hqg.setVisibility(8);
          }
          for (;;)
          {
            localj.hqg.setVisibility(8);
            localj.mtX.setVisibility(8);
            localj.mtV.setText("");
            localj.mtW.setText("");
            localj.mnl.setVisibility(0);
            com.tencent.mm.plugin.report.service.g.ork.i(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
            GMTrace.o(11623255244800L, 86600);
            return;
            localj.hqg.setVisibility(4);
          }
        }
        j localj = j.this;
        if (localj.mtM != null)
        {
          localj.hqg.setVisibility(0);
          localj.mtX.setVisibility(8);
        }
        for (;;)
        {
          localj.AF(localj.mug);
          localj.mnl.setVisibility(4);
          break;
          localj.mtX.setVisibility(0);
          localj.hqg.setVisibility(8);
        }
      }
    };
    this.mub.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11661238861824L, 86883);
        j.this.aJz();
        GMTrace.o(11661238861824L, 86883);
      }
    });
    this.mnl.mnj = new DialPad.a()
    {
      public final void Ap(String paramAnonymousString)
      {
        GMTrace.i(11649696137216L, 86797);
        String str2 = j.this.mtV.getText().toString();
        if (bg.nm(str2)) {
          j.this.mul = System.currentTimeMillis();
        }
        long l = System.currentTimeMillis();
        String str1 = str2;
        if (l - j.this.mul >= 3000L) {
          str1 = str2 + " ";
        }
        str1 = str1 + paramAnonymousString;
        j.this.mul = l;
        j.this.cG(str1, "");
        com.tencent.mm.plugin.ipcall.c.Ag(paramAnonymousString);
        com.tencent.mm.plugin.report.service.g.ork.i(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        GMTrace.o(11649696137216L, 86797);
      }
      
      public final void Aq(String paramAnonymousString)
      {
        GMTrace.i(11649830354944L, 86798);
        GMTrace.o(11649830354944L, 86798);
      }
    };
    GMTrace.o(11701235744768L, 87181);
  }
  
  public final void aJz()
  {
    GMTrace.i(16062775033856L, 119677);
    this.mui.co(0, 0);
    at.getNotification().cancel(42);
    this.muh.finish();
    GMTrace.o(16062775033856L, 119677);
  }
  
  public final void c(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(11702309486592L, 87189);
    w.d("MicroMsg.TalkUIController", "onError, error: %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt2 == 1) {
      this.muq = false;
    }
    if (paramInt1 == 8) {
      if (paramInt2 == 1)
      {
        if (!bg.nm(paramString1)) {
          break label184;
        }
        paramString1 = this.muh.getString(R.l.dEb);
      }
    }
    label184:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this.muh, paramString2, paramString1, this.muh.getString(R.l.dEc), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11705799147520L, 87215);
          j.this.muh.finish();
          GMTrace.o(11705799147520L, 87215);
        }
      });
      for (;;)
      {
        at.getNotification().cancel(42);
        if ((this.muj != null) && (!this.mur)) {
          this.muj.fy(this.muq);
        }
        GMTrace.o(11702309486592L, 87189);
        return;
        c(paramString1, paramString2, paramInt2, this.muh.getString(R.l.dEa));
        continue;
        if (paramInt1 != 10) {}
        c(paramString1, paramString2, paramInt2, null);
      }
    }
  }
  
  public final void cG(String paramString1, String paramString2)
  {
    GMTrace.i(11701504180224L, 87183);
    this.mtV.setText(paramString1);
    if (!bg.nm(paramString1)) {
      this.mtV.setSelection(this.mtV.getText().length() - 1);
    }
    this.mtW.setText(paramString2);
    GMTrace.o(11701504180224L, 87183);
  }
  
  public final void fq(boolean paramBoolean)
  {
    GMTrace.i(11702443704320L, 87190);
    w.d("MicroMsg.TalkUIController", "onHeadsetPlugStateChange, isPlugged: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (i.aIs().aIj())
    {
      if (paramBoolean)
      {
        i.aIr();
        this.mum = com.tencent.mm.plugin.ipcall.a.b.a.sm();
        i.aIr().fn(false);
        this.mua.fv(false);
        GMTrace.o(11702443704320L, 87190);
        return;
      }
      i.aIr().fn(this.mum);
      this.mua.fv(true);
      this.mua.setChecked(this.mum);
    }
    GMTrace.o(11702443704320L, 87190);
  }
  
  public final void fr(boolean paramBoolean)
  {
    GMTrace.i(11702577922048L, 87191);
    w.d("MicroMsg.TalkUIController", "onBluetoothPlugStateChange, isPlugged: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (i.aIs().aIj())
    {
      if (paramBoolean)
      {
        i.aIr();
        this.mun = com.tencent.mm.plugin.ipcall.a.b.a.sm();
        i.aIr().fn(false);
        this.mua.fv(false);
        GMTrace.o(11702577922048L, 87191);
        return;
      }
      i.aIr().fn(this.mun);
      this.mua.fv(true);
      this.mua.setChecked(this.mun);
    }
    GMTrace.o(11702577922048L, 87191);
  }
  
  public final void pC(int paramInt)
  {
    GMTrace.i(11701638397952L, 87184);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11701638397952L, 87184);
      return;
      GMTrace.o(11701638397952L, 87184);
      return;
      paramInt = i.aIo().miY.mjV;
      Object localObject = ab.getContext();
      if (((paramInt & 0x1) > 0) && ((paramInt & 0x2) <= 0)) {
        localObject = ((Context)localObject).getString(R.l.dFP) + " ";
      }
      while (this.muf != -1)
      {
        String str = com.tencent.mm.plugin.ipcall.b.a.pD(this.muf);
        this.hql.setText((String)localObject + this.muh.getString(R.l.dEV, new Object[] { str }));
        GMTrace.o(11701638397952L, 87184);
        return;
        if ((paramInt & 0x8) > 0) {
          localObject = ((Context)localObject).getString(R.l.dFQ) + " ";
        } else {
          localObject = "";
        }
      }
      this.hql.setText((String)localObject + this.muh.getString(R.l.dEU));
      GMTrace.o(11701638397952L, 87184);
      return;
      GMTrace.o(11701638397952L, 87184);
      return;
      this.hql.setText(String.format("%02d:%02d", new Object[] { Long.valueOf(this.muk / 60L), Long.valueOf(this.muk % 60L) }));
      GMTrace.o(11701638397952L, 87184);
      return;
      this.hql.setText(R.l.dEX);
    }
  }
  
  public static abstract interface a
  {
    public abstract void fy(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */