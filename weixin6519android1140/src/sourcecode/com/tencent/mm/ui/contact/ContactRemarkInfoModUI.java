package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelmulti.q;
import com.tencent.mm.modelmulti.r;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView;
import com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView.a;
import com.tencent.mm.protocal.c.apf;
import com.tencent.mm.protocal.c.atp;
import com.tencent.mm.protocal.c.atq;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactRemarkInfoModUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String aDo;
  private String fjt;
  private String gQT;
  private x iBi;
  private ProgressDialog jIU;
  private String mvZ;
  private int nLz;
  private MMTagPanel nPb;
  private List<String> nPc;
  private m.b nPd;
  private String tDo;
  private String username;
  private a wRA;
  private TextView wRB;
  private ScrollView wRC;
  private ProfileEditPhoneNumberView wRD;
  private String wRE;
  private String wRF;
  private String wRG;
  boolean wRH;
  boolean wRI;
  private boolean wRJ;
  private MMClearEditText wRh;
  private TextView wRi;
  private MMEditText wRj;
  private TextView wRk;
  private TextView wRl;
  private TextView wRm;
  private TextView wRn;
  private ImageView wRo;
  private ImageView wRp;
  private TextView wRq;
  private View wRr;
  private View wRs;
  private View wRt;
  private String wRu;
  private boolean wRv;
  private boolean wRw;
  private boolean wRx;
  private boolean wRy;
  private boolean wRz;
  
  public ContactRemarkInfoModUI()
  {
    GMTrace.i(1720671272960L, 12820);
    this.wRv = false;
    this.wRw = false;
    this.wRx = false;
    this.wRy = false;
    this.wRz = false;
    this.wRA = new a();
    this.nPd = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(17926522404864L, 133563);
        w.d("MiroMsg.ContactRemarkInfoModUI", "cpan onNotifyChange");
        ContactRemarkInfoModUI.d(ContactRemarkInfoModUI.this);
        GMTrace.o(17926522404864L, 133563);
      }
    };
    this.wRH = true;
    this.wRI = false;
    this.wRJ = false;
    GMTrace.o(1720671272960L, 12820);
  }
  
  private void Wx(String paramString)
  {
    GMTrace.i(1722147667968L, 12831);
    if (t.nm(paramString))
    {
      GMTrace.o(1722147667968L, 12831);
      return;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(1722147667968L, 12831);
      return;
    }
    if (paramString.length() > 204800L)
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.diU), null, true);
      GMTrace.o(1722147667968L, 12831);
      return;
    }
    float f = com.tencent.mm.br.a.getDensity(this);
    paramString = BackwardSupportUtil.b.c(this.wRu, f);
    if (paramString != null)
    {
      this.wRm.setVisibility(8);
      this.wRp.setVisibility(8);
      this.wRo.setVisibility(0);
      this.wRo.setImageBitmap(paramString);
      this.wRv = true;
    }
    GMTrace.o(1722147667968L, 12831);
  }
  
  private String Wy(String paramString)
  {
    GMTrace.i(1723892498432L, 12844);
    if (!com.tencent.mm.a.e.aZ(paramString))
    {
      GMTrace.o(1723892498432L, 12844);
      return null;
    }
    int i = BackwardSupportUtil.ExifHelper.Rz(paramString);
    Object localObject = new StringBuilder();
    com.tencent.mm.ay.c.Kn();
    localObject = com.tencent.mm.ay.c.kF(this.username) + ".tmp";
    if (!com.tencent.mm.sdk.platformtools.d.a(paramString, 960, 960, Bitmap.CompressFormat.JPEG, 70, (String)localObject))
    {
      w.e("MiroMsg.ContactRemarkInfoModUI", "createThumbNail big pic fail");
      GMTrace.o(1723892498432L, 12844);
      return null;
    }
    if ((i != 0) && (!com.tencent.mm.sdk.platformtools.d.a((String)localObject, i, Bitmap.CompressFormat.JPEG, 70, (String)localObject)))
    {
      w.e("MiroMsg.ContactRemarkInfoModUI", "rotate big pic fail");
      GMTrace.o(1723892498432L, 12844);
      return null;
    }
    GMTrace.o(1723892498432L, 12844);
    return (String)localObject;
  }
  
  private void aXY()
  {
    GMTrace.i(1724026716160L, 12845);
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(this.username);
    this.mvZ = this.iBi.field_contactLabelIds;
    this.nPc = com.tencent.mm.plugin.label.a.a.aJP().AX(this.mvZ);
    if (!t.nm(this.mvZ))
    {
      this.nPb.setVisibility(0);
      this.wRB.setVisibility(8);
      this.nPb.a(this.nPc, this.nPc);
      GMTrace.o(1724026716160L, 12845);
      return;
    }
    this.nPb.setVisibility(8);
    this.wRB.setVisibility(0);
    GMTrace.o(1724026716160L, 12845);
  }
  
  private void anG()
  {
    GMTrace.i(1720805490688L, 12821);
    ProfileEditPhoneNumberView localProfileEditPhoneNumberView = this.wRD;
    Object localObject = localProfileEditPhoneNumberView.bLa();
    boolean bool;
    if ((localObject == null) || (((ArrayList)localObject).isEmpty()))
    {
      if (localProfileEditPhoneNumberView.tuj == null) {
        break label174;
      }
      bool = true;
    }
    for (;;)
    {
      this.wRJ = bool;
      if ((!cgp()) && (!cgq()) && (!mq(false)) && (!this.wRJ)) {
        break;
      }
      lf(true);
      GMTrace.o(1720805490688L, 12821);
      return;
      if (localProfileEditPhoneNumberView.tuj == null)
      {
        bool = true;
      }
      else if (((ArrayList)localObject).size() != localProfileEditPhoneNumberView.tuj.length)
      {
        bool = true;
      }
      else
      {
        localObject = ((ArrayList)localObject).iterator();
        int i = 0;
        for (;;)
        {
          if (!((Iterator)localObject).hasNext()) {
            break label174;
          }
          if (!((String)((Iterator)localObject).next()).equals(localProfileEditPhoneNumberView.tuj[i]))
          {
            bool = true;
            break;
          }
          i += 1;
        }
        label174:
        bool = false;
      }
    }
    lf(false);
    GMTrace.o(1720805490688L, 12821);
  }
  
  private void cgm()
  {
    GMTrace.i(1721879232512L, 12829);
    this.wRi.setFocusableInTouchMode(true);
    this.wRi.requestFocus();
    this.wRh.clearFocus();
    this.wRj.clearFocus();
    this.wRD.clearFocus();
    aLo();
    GMTrace.o(1721879232512L, 12829);
  }
  
  private void cgn()
  {
    GMTrace.i(1722013450240L, 12830);
    Bitmap localBitmap = com.tencent.mm.ay.c.Kn().kI(this.username);
    if (localBitmap != null)
    {
      this.wRm.setVisibility(8);
      this.wRp.setVisibility(8);
      this.wRo.setVisibility(0);
      this.wRo.setImageBitmap(localBitmap);
    }
    this.wRv = true;
    GMTrace.o(1722013450240L, 12830);
  }
  
  private void cgo()
  {
    GMTrace.i(1722550321152L, 12834);
    if (!this.wRJ)
    {
      GMTrace.o(1722550321152L, 12834);
      return;
    }
    Object localObject2 = new apf();
    ((apf)localObject2).uEJ = this.username;
    Object localObject3 = new atq();
    Object localObject1 = this.wRD.bLa();
    if (localObject1 == null) {}
    for (int i = 0;; i = ((ArrayList)localObject1).size())
    {
      ((atq)localObject3).jhc = i;
      ((atq)localObject3).uJi = new LinkedList();
      if (localObject1 == null) {
        break;
      }
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        atp localatp = new atp();
        localatp.uJh = str;
        ((atq)localObject3).uJi.add(localatp);
      }
    }
    ((apf)localObject2).uEF = ((atq)localObject3);
    at.AR();
    com.tencent.mm.y.c.yJ().b(new e.a(60, (com.tencent.mm.bm.a)localObject2));
    at.AR();
    localObject2 = com.tencent.mm.y.c.yK().TE(this.username);
    if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).fTq > 0) && (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type)))
    {
      if (localObject1 != null)
      {
        localObject3 = ((ArrayList)localObject1).iterator();
        for (localObject1 = "";; localObject1 = (String)localObject1 + ",")
        {
          localObject2 = localObject1;
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          localObject2 = (String)((Iterator)localObject3).next();
          localObject1 = (String)localObject1 + (String)localObject2;
        }
      }
      localObject2 = "";
      w.i("MiroMsg.ContactRemarkInfoModUI", "[dealModPhoneNumberList] username:%s %s", new Object[] { this.username, localObject2 });
      this.iBi.cL((String)localObject2);
      at.AR();
      com.tencent.mm.y.c.yK().Q(this.iBi);
    }
    GMTrace.o(1722550321152L, 12834);
  }
  
  private boolean cgp()
  {
    GMTrace.i(1722818756608L, 12836);
    String str = this.wRj.getText().toString();
    if (((this.fjt == null) || (!this.fjt.equals(str))) && ((!t.nm(this.fjt)) || (!t.nm(str))))
    {
      GMTrace.o(1722818756608L, 12836);
      return true;
    }
    GMTrace.o(1722818756608L, 12836);
    return false;
  }
  
  private boolean cgq()
  {
    GMTrace.i(1722952974336L, 12837);
    if ((!t.nm(this.wRu)) || (this.wRz))
    {
      GMTrace.o(1722952974336L, 12837);
      return true;
    }
    GMTrace.o(1722952974336L, 12837);
    return false;
  }
  
  private void cgr()
  {
    GMTrace.i(1723489845248L, 12841);
    this.wRz = true;
    this.wRp.setVisibility(8);
    this.wRm.setVisibility(0);
    this.wRo.setVisibility(8);
    this.wRo.setImageBitmap(null);
    anG();
    GMTrace.o(1723489845248L, 12841);
  }
  
  private void goBack()
  {
    GMTrace.i(1723087192064L, 12838);
    boolean bool1 = cgq();
    boolean bool2 = mq(true);
    boolean bool3 = cgp();
    if ((bool1) || (bool2) || (bool3))
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dkw), null, getString(R.l.dky), getString(R.l.dkx), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(14304254361600L, 106575);
          ContactRemarkInfoModUI.q(ContactRemarkInfoModUI.this);
          GMTrace.o(14304254361600L, 106575);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(17923972268032L, 133544);
          ContactRemarkInfoModUI.this.finish();
          GMTrace.o(17923972268032L, 133544);
        }
      });
      GMTrace.o(1723087192064L, 12838);
      return;
    }
    aLo();
    finish();
    GMTrace.o(1723087192064L, 12838);
  }
  
  private boolean mq(boolean paramBoolean)
  {
    GMTrace.i(1722684538880L, 12835);
    String str = this.wRh.getText().toString();
    if (!paramBoolean)
    {
      if (((this.aDo == null) || (!this.aDo.equals(str))) && ((!t.nm(this.aDo)) || (!t.nm(str))))
      {
        GMTrace.o(1722684538880L, 12835);
        return true;
      }
      GMTrace.o(1722684538880L, 12835);
      return false;
    }
    if (((this.aDo == null) || (!this.aDo.equals(str))) && ((!t.nm(this.aDo)) || (!t.nm(str)))) {}
    for (int i = 1; (i != 0) && ((str == null) || (!str.equals(this.iBi.field_nickname))); i = 0)
    {
      GMTrace.o(1722684538880L, 12835);
      return true;
    }
    GMTrace.o(1722684538880L, 12835);
    return false;
  }
  
  private void w(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(1721610797056L, 12827);
    if (this.wRx)
    {
      this.wRk.setVisibility(8);
      if ((paramBoolean) && (t.nm(this.fjt)))
      {
        this.wRl.setVisibility(0);
        this.wRt.setVisibility(8);
      }
      for (;;)
      {
        this.wRh.setVisibility(0);
        GMTrace.o(1721610797056L, 12827);
        return;
        if (paramInt == R.h.bqT)
        {
          this.wRl.setVisibility(8);
          this.wRt.setVisibility(0);
        }
      }
    }
    this.wRk.setVisibility(0);
    this.wRl.setVisibility(0);
    this.wRh.setVisibility(8);
    this.wRt.setVisibility(8);
    GMTrace.o(1721610797056L, 12827);
  }
  
  protected final void MP()
  {
    GMTrace.i(1721745014784L, 12828);
    this.wRi = ((TextView)findViewById(R.h.bqN));
    this.wRk = ((TextView)findViewById(R.h.bqV));
    this.wRl = ((TextView)findViewById(R.h.bqT));
    this.wRm = ((TextView)findViewById(R.h.bqU));
    this.wRh = ((MMClearEditText)findViewById(R.h.bqM));
    this.wRj = ((MMEditText)findViewById(R.h.bqL));
    this.wRo = ((ImageView)findViewById(R.h.bYp));
    this.wRp = ((ImageView)findViewById(R.h.bYq));
    this.wRn = ((TextView)findViewById(R.h.coE));
    this.wRt = findViewById(R.h.bqK);
    this.wRD = ((ProfileEditPhoneNumberView)findViewById(R.h.bNY));
    this.wRD.kse = this.iBi;
    final Object localObject = this.wRD;
    String str1 = this.wRE;
    String str2 = this.wRF;
    ((ProfileEditPhoneNumberView)localObject).tuh = str1;
    ((ProfileEditPhoneNumberView)localObject).tui = str2;
    ((ProfileEditPhoneNumberView)localObject).aXX();
    this.wRD.tum = new ProfileEditPhoneNumberView.a()
    {
      public final void aic()
      {
        GMTrace.i(17926656622592L, 133564);
        ContactRemarkInfoModUI.b(ContactRemarkInfoModUI.this);
        GMTrace.o(17926656622592L, 133564);
      }
      
      public final void bLc()
      {
        GMTrace.i(17926790840320L, 133565);
        s.r(ContactRemarkInfoModUI.e(ContactRemarkInfoModUI.this));
        q.JF().gE(7);
        GMTrace.o(17926790840320L, 133565);
      }
    };
    this.nPb = ((MMTagPanel)findViewById(R.h.bqJ));
    this.nPb.lNJ = false;
    this.wRC = ((ScrollView)findViewById(R.h.bZQ));
    this.wRB = ((TextView)findViewById(R.h.bqH));
    this.wRB.setText(R.l.dIY);
    this.nPb.setOnClickListener(this.wRA);
    this.wRB.setOnClickListener(this.wRA);
    oM(R.l.djX);
    label658:
    int i;
    if (!t.nm(this.aDo))
    {
      this.wRh.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.aDo), this.wRh.getTextSize()));
      this.wRk.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.aDo), this.wRk.getTextSize()));
      this.wRh.setSelection(this.wRh.getText().length());
      localObject = com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.fjt), this.wRl.getTextSize());
      this.wRj.setText((CharSequence)localObject);
      this.wRj.setSelection(this.wRj.getText().length());
      if (!t.nm(this.fjt))
      {
        this.wRl.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.fjt), this.wRl.getTextSize()));
        this.wRl.setTextColor(getResources().getColor(R.e.aOE));
      }
      this.wRk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17926388187136L, 133562);
          ContactRemarkInfoModUI.f(ContactRemarkInfoModUI.this);
          ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, false, paramAnonymousView.getId());
          ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).performClick();
          ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).requestFocus();
          ContactRemarkInfoModUI.this.aLs();
          GMTrace.o(17926388187136L, 133562);
        }
      });
      this.wRl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1765902647296L, 13157);
          ContactRemarkInfoModUI.f(ContactRemarkInfoModUI.this);
          ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, false, paramAnonymousView.getId());
          ContactRemarkInfoModUI.h(ContactRemarkInfoModUI.this).performClick();
          ContactRemarkInfoModUI.h(ContactRemarkInfoModUI.this).requestFocus();
          ContactRemarkInfoModUI.this.aLs();
          GMTrace.o(1765902647296L, 13157);
        }
      });
      this.wRh.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(17924509138944L, 133548);
          ContactRemarkInfoModUI.b(ContactRemarkInfoModUI.this);
          GMTrace.o(17924509138944L, 133548);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(17924374921216L, 133547);
          GMTrace.o(17924374921216L, 133547);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(17924240703488L, 133546);
          GMTrace.o(17924240703488L, 133546);
        }
      });
      this.wRn.setText(com.tencent.mm.ui.tools.h.aO(800, this.wRj.getEditableText().toString()));
      this.wRj.setOnFocusChangeListener(new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(17925448663040L, 133555);
          if (!paramAnonymousBoolean)
          {
            ContactRemarkInfoModUI.i(ContactRemarkInfoModUI.this).setBackgroundResource(R.g.aXt);
            GMTrace.o(17925448663040L, 133555);
            return;
          }
          ContactRemarkInfoModUI.i(ContactRemarkInfoModUI.this).setBackgroundResource(R.g.aXs);
          GMTrace.o(17925448663040L, 133555);
        }
      });
      this.wRj.addTextChangedListener(new b());
      if (t.nm(this.gQT)) {
        break label944;
      }
      this.wRm.setVisibility(8);
      this.wRo.setVisibility(0);
      com.tencent.mm.ay.c.Kn();
      if (com.tencent.mm.ay.c.kG(this.username)) {
        break label937;
      }
      com.tencent.mm.ay.c.Kn().a(this.username, this.gQT, new com.tencent.mm.ay.c.a()
      {
        public final void by(final boolean paramAnonymousBoolean)
        {
          GMTrace.i(17927461928960L, 133570);
          ContactRemarkInfoModUI.u(ContactRemarkInfoModUI.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(17927059275776L, 133567);
              if (!paramAnonymousBoolean)
              {
                com.tencent.mm.ui.base.h.bm(ContactRemarkInfoModUI.this, ContactRemarkInfoModUI.this.getString(R.l.cSM));
                ContactRemarkInfoModUI.s(ContactRemarkInfoModUI.this).setVisibility(0);
                ContactRemarkInfoModUI.t(ContactRemarkInfoModUI.this).setVisibility(8);
                ContactRemarkInfoModUI.u(ContactRemarkInfoModUI.this).setVisibility(8);
                GMTrace.o(17927059275776L, 133567);
                return;
              }
              ContactRemarkInfoModUI.v(ContactRemarkInfoModUI.this);
              GMTrace.o(17927059275776L, 133567);
            }
          });
          GMTrace.o(17927461928960L, 133570);
        }
      });
      this.wRo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17924643356672L, 133549);
          if (!ContactRemarkInfoModUI.j(ContactRemarkInfoModUI.this))
          {
            GMTrace.o(17924643356672L, 133549);
            return;
          }
          ContactRemarkInfoModUI.k(ContactRemarkInfoModUI.this);
          Intent localIntent = new Intent(ContactRemarkInfoModUI.this, ContactRemarkImagePreviewUI.class);
          localIntent.putExtra("Contact_User", ContactRemarkInfoModUI.l(ContactRemarkInfoModUI.this));
          if ((!t.nm(ContactRemarkInfoModUI.m(ContactRemarkInfoModUI.this))) && (!ContactRemarkInfoModUI.n(ContactRemarkInfoModUI.this))) {
            com.tencent.mm.ay.c.Kn();
          }
          for (paramAnonymousView = com.tencent.mm.ay.c.kF(ContactRemarkInfoModUI.l(ContactRemarkInfoModUI.this));; paramAnonymousView = ContactRemarkInfoModUI.o(ContactRemarkInfoModUI.this))
          {
            localIntent.putExtra("remark_image_path", paramAnonymousView);
            localIntent.putExtra("view_temp_remark_image", ContactRemarkInfoModUI.n(ContactRemarkInfoModUI.this));
            ContactRemarkInfoModUI.this.startActivityForResult(localIntent, 400);
            GMTrace.o(17924643356672L, 133549);
            return;
          }
        }
      });
      this.wRm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1822274093056L, 13577);
          if ((t.nm(ContactRemarkInfoModUI.m(ContactRemarkInfoModUI.this))) || (ContactRemarkInfoModUI.p(ContactRemarkInfoModUI.this)))
          {
            ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, false);
            ContactRemarkInfoModUI.k(ContactRemarkInfoModUI.this);
          }
          GMTrace.o(1822274093056L, 13577);
        }
      });
      localObject = com.tencent.mm.modelfriend.af.If().jJ(this.iBi.field_username);
      if ((localObject != null) && (!t.nm(((com.tencent.mm.modelfriend.b)localObject).GU())) && (!((com.tencent.mm.modelfriend.b)localObject).GU().equals(this.wRh.getText().toString()))) {
        break label964;
      }
      i = 0;
      label738:
      if ((i == 0) && (this.nLz == 14) && (!t.nm(this.tDo)) && (!this.tDo.equals(this.wRh.getText().toString()))) {
        break label1054;
      }
      label781:
      a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17926253969408L, 133561);
          ContactRemarkInfoModUI.q(ContactRemarkInfoModUI.this);
          ContactRemarkInfoModUI.this.aLo();
          GMTrace.o(17926253969408L, 133561);
          return false;
        }
      }, p.b.vLG);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1777713807360L, 13245);
          ContactRemarkInfoModUI.r(ContactRemarkInfoModUI.this);
          GMTrace.o(1777713807360L, 13245);
          return true;
        }
      });
      if (!t.nm(this.aDo)) {
        break label1155;
      }
      lf(true);
    }
    for (;;)
    {
      this.wRp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17925180227584L, 133553);
          ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, true);
          ContactRemarkInfoModUI.k(ContactRemarkInfoModUI.this);
          GMTrace.o(17925180227584L, 133553);
        }
      });
      if (!this.wRy)
      {
        this.wRx = true;
        w(true, -1);
      }
      cgm();
      GMTrace.o(1721745014784L, 12828);
      return;
      this.wRh.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.iBi.vj()), this.wRh.getTextSize()));
      this.wRk.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.iBi.vj()), this.wRh.getTextSize()));
      break;
      label937:
      cgn();
      break label658;
      label944:
      this.wRm.setVisibility(0);
      this.wRo.setVisibility(8);
      break label658;
      label964:
      this.wRq = ((TextView)findViewById(R.h.bOe));
      this.wRr = findViewById(R.h.bNZ);
      this.wRs = findViewById(R.h.bOf);
      this.wRr.setVisibility(0);
      this.wRq.setText(getString(R.l.dkL, new Object[] { ((com.tencent.mm.modelfriend.b)localObject).GU() }));
      this.wRs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14302777966592L, 106564);
          ContactRemarkInfoModUI.f(ContactRemarkInfoModUI.this);
          ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, true, -1);
          ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).setText(localObject.GU());
          ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).setSelection(ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).getText().length());
          ContactRemarkInfoModUI.x(ContactRemarkInfoModUI.this).setVisibility(8);
          GMTrace.o(14302777966592L, 106564);
        }
      });
      i = 1;
      break label738;
      label1054:
      this.wRq = ((TextView)findViewById(R.h.bOe));
      this.wRr = findViewById(R.h.bNZ);
      this.wRs = findViewById(R.h.bOf);
      this.wRr.setVisibility(0);
      this.wRq.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(getString(R.l.dkK, new Object[] { this.tDo })), this.wRq.getTextSize()));
      this.wRs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17924911792128L, 133551);
          ContactRemarkInfoModUI.f(ContactRemarkInfoModUI.this);
          ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, true, -1);
          ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).setText(com.tencent.mm.pluginsdk.ui.d.h.b(ContactRemarkInfoModUI.this, t.nl(ContactRemarkInfoModUI.y(ContactRemarkInfoModUI.this)), ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).getTextSize()));
          ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).setSelection(ContactRemarkInfoModUI.g(ContactRemarkInfoModUI.this).getText().length());
          ContactRemarkInfoModUI.x(ContactRemarkInfoModUI.this).setVisibility(8);
          GMTrace.o(17924911792128L, 133551);
        }
      });
      break label781;
      label1155:
      lf(false);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(1723624062976L, 12842);
    w.i("MiroMsg.ContactRemarkInfoModUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.jIU != null)
    {
      this.jIU.dismiss();
      this.jIU = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.cSL), null, true);
      GMTrace.o(1723624062976L, 12842);
      return;
    }
    if (paramk.getType() == 575)
    {
      if (this.wRu != null)
      {
        paramString = new File(this.wRu);
        if (paramString.exists())
        {
          com.tencent.mm.ay.c.Kn();
          paramString.renameTo(new File(com.tencent.mm.ay.c.kF(this.username)));
        }
      }
      paramString = ((com.tencent.mm.ay.b)paramk).gQT;
      if (!t.nm(paramString)) {
        this.gQT = paramString;
      }
    }
    for (;;)
    {
      finish();
      GMTrace.o(1723624062976L, 12842);
      return;
      if (paramk.getType() == 576)
      {
        this.wRu = null;
        this.gQT = null;
        this.wRv = false;
        at.AR();
        this.iBi = com.tencent.mm.y.c.yK().TE(this.username);
        this.iBi.cG("");
        at.AR();
        com.tencent.mm.y.c.yK().a(this.username, this.iBi);
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1721476579328L, 12826);
    int i = R.i.ctU;
    GMTrace.o(1721476579328L, 12826);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1723355627520L, 12840);
    w.i("MiroMsg.ContactRemarkInfoModUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      w.e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
      GMTrace.o(1723355627520L, 12840);
      return;
    }
    Context localContext;
    switch (paramInt1)
    {
    default: 
      GMTrace.o(1723355627520L, 12840);
      return;
    case 100: 
      localContext = getApplicationContext();
      at.AR();
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.k.b(localContext, paramIntent, com.tencent.mm.y.c.yU());
      if (paramIntent == null)
      {
        GMTrace.o(1723355627520L, 12840);
        return;
      }
      this.wRu = Wy(paramIntent);
      Wx(this.wRu);
      this.wRw = true;
      this.wRz = false;
      anG();
      GMTrace.o(1723355627520L, 12840);
      return;
    case 200: 
      localContext = getApplicationContext();
      at.AR();
      paramIntent = com.tencent.mm.ui.tools.a.c(localContext, paramIntent, com.tencent.mm.y.c.yU());
      if (paramIntent == null)
      {
        GMTrace.o(1723355627520L, 12840);
        return;
      }
      this.wRu = Wy(paramIntent);
      Wx(this.wRu);
      this.wRw = true;
      this.wRz = false;
      anG();
      GMTrace.o(1723355627520L, 12840);
      return;
    case 400: 
      if (paramIntent.getBooleanExtra("response_delete", false)) {
        cgr();
      }
      GMTrace.o(1723355627520L, 12840);
      return;
    }
    if ((mq(true)) || (cgp()) || (cgq()) || (paramIntent.getBooleanExtra("hasLableChange", false)))
    {
      lf(true);
      GMTrace.o(1723355627520L, 12840);
      return;
    }
    lf(false);
    GMTrace.o(1723355627520L, 12840);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1720939708416L, 12822);
    super.onCreate(paramBundle);
    at.wS().a(575, this);
    at.wS().a(576, this);
    this.nLz = getIntent().getIntExtra("Contact_Scene", 9);
    this.tDo = getIntent().getStringExtra("Contact_RoomNickname");
    this.wRy = getIntent().getBooleanExtra("view_mode", false);
    this.wRG = getIntent().getStringExtra("contact_auto_app_phone_from_chatting");
    this.wRE = getIntent().getStringExtra("contact_phone_number_by_md5");
    this.wRF = getIntent().getStringExtra("contact_phone_number_list");
    this.username = getIntent().getStringExtra("Contact_User");
    if (t.nm(this.username))
    {
      finish();
      GMTrace.o(1720939708416L, 12822);
      return;
    }
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(this.username);
    this.aDo = this.iBi.field_conRemark;
    this.fjt = this.iBi.fjt;
    this.gQT = this.iBi.fju;
    this.mvZ = this.iBi.field_contactLabelIds;
    this.nPc = com.tencent.mm.plugin.label.a.a.aJP().AX(this.mvZ);
    MP();
    anG();
    GMTrace.o(1720939708416L, 12822);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1721342361600L, 12825);
    at.wS().b(575, this);
    at.wS().b(576, this);
    super.onDestroy();
    GMTrace.o(1721342361600L, 12825);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1723221409792L, 12839);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      goBack();
      GMTrace.o(1723221409792L, 12839);
      return true;
    }
    GMTrace.o(1723221409792L, 12839);
    return false;
  }
  
  protected void onPause()
  {
    GMTrace.i(1721208143872L, 12824);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.nPd);
    super.onPause();
    GMTrace.o(1721208143872L, 12824);
  }
  
  public void onResume()
  {
    GMTrace.i(1721073926144L, 12823);
    super.onResume();
    at.AR();
    com.tencent.mm.y.c.yK().a(this.nPd);
    aXY();
    GMTrace.o(1721073926144L, 12823);
  }
  
  private final class a
    implements View.OnClickListener
  {
    public a()
    {
      GMTrace.i(1832743075840L, 13655);
      GMTrace.o(1832743075840L, 13655);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(1832877293568L, 13656);
      ContactRemarkInfoModUI.c(ContactRemarkInfoModUI.this);
      GMTrace.o(1832877293568L, 13656);
    }
  }
  
  private final class b
    implements TextWatcher
  {
    private int oGE;
    private String wRN;
    
    public b()
    {
      GMTrace.i(1793954152448L, 13366);
      this.oGE = 800;
      this.wRN = "";
      GMTrace.o(1793954152448L, 13366);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(1794356805632L, 13369);
      this.oGE = com.tencent.mm.ui.tools.h.aO(800, paramEditable.toString());
      if (this.oGE < 0) {
        this.oGE = 0;
      }
      if (ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this) != null) {
        ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this).setText(this.oGE);
      }
      ContactRemarkInfoModUI.b(ContactRemarkInfoModUI.this);
      GMTrace.o(1794356805632L, 13369);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1794088370176L, 13367);
      GMTrace.o(1794088370176L, 13367);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1794222587904L, 13368);
      GMTrace.o(1794222587904L, 13368);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\ContactRemarkInfoModUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */