package com.tencent.mm.pluginsdk.ui.preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.j;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.b.bz;
import com.tencent.mm.plugin.messenger.foundation.a.a.g.a;
import com.tencent.mm.pluginsdk.ui.ProfileDescribeView;
import com.tencent.mm.pluginsdk.ui.ProfileLabelView;
import com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import junit.framework.Assert;

public class NormalUserHeaderPreference
  extends Preference
  implements d.a, g.a, m.b
{
  public MMActivity ezR;
  public x iBi;
  public boolean kEu;
  private TextView mOE;
  private String nLA;
  private ImageView nLi;
  private TextView nLl;
  private boolean nNi;
  private boolean nNp;
  private boolean nOr;
  int oPH;
  private ImageView oPn;
  private TextView tCR;
  private TextView tCS;
  private TextView tCT;
  private View tCU;
  private Button tCV;
  private Button tCW;
  private TextView tCX;
  private ImageView tCY;
  private CheckBox tCZ;
  private ImageView tDa;
  private ImageView tDb;
  private LinearLayout tDc;
  private Button tDd;
  public FMessageListView tDe;
  private int tDf;
  private boolean tDg;
  private boolean tDh;
  private boolean tDi;
  private boolean tDj;
  public boolean tDk;
  private boolean tDl;
  private boolean tDm;
  private boolean tDn;
  private String tDo;
  private ProfileMobilePhoneView tDp;
  private ProfileDescribeView tDq;
  private ProfileLabelView tDr;
  private TextView tDs;
  public View.OnClickListener tDt;
  public String tDu;
  public String tuh;
  public String tui;
  
  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1049716850688L, 7821);
    this.kEu = false;
    this.tDf = 0;
    this.tDg = false;
    this.tDh = false;
    this.tDi = false;
    this.tDj = false;
    this.tDk = false;
    this.tDl = false;
    this.tDm = false;
    this.nOr = false;
    this.tDn = false;
    this.nNp = false;
    this.tDu = null;
    this.ezR = ((MMActivity)paramContext);
    this.kEu = false;
    GMTrace.o(1049716850688L, 7821);
  }
  
  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1049851068416L, 7822);
    this.kEu = false;
    this.tDf = 0;
    this.tDg = false;
    this.tDh = false;
    this.tDi = false;
    this.tDj = false;
    this.tDk = false;
    this.tDl = false;
    this.tDm = false;
    this.nOr = false;
    this.tDn = false;
    this.nNp = false;
    this.tDu = null;
    this.ezR = ((MMActivity)paramContext);
    this.kEu = false;
    GMTrace.o(1049851068416L, 7822);
  }
  
  private void MP()
  {
    int j = 0;
    GMTrace.i(1050522157056L, 7827);
    if (!aXB())
    {
      w.w("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.kEu + "contact = " + this.iBi);
      GMTrace.o(1050522157056L, 7827);
      return;
    }
    if (this.nNp)
    {
      this.tCX.setVisibility(0);
      this.mOE.setText(h.b(this.ezR, bg.nl(this.iBi.vj()) + " ", this.mOE.getTextSize()));
      bbE();
      this.tDd.setVisibility(8);
      this.nLl.setVisibility(8);
      this.tDe.setVisibility(8);
      if ((this.tDe.getVisibility() == 8) && (this.tDs.getVisibility() == 8) && (this.tDr.getVisibility() == 8) && (this.tDq.getVisibility() == 8) && (this.tCT.getVisibility() == 8)) {
        this.tCU.setVisibility(8);
      }
      this.tCV.setVisibility(8);
      this.tCW.setVisibility(8);
      this.tCZ.setVisibility(8);
      if (this.tDr != null) {
        this.tDr.setVisibility(8);
      }
      if (this.tDp != null) {
        this.tDp.setVisibility(8);
      }
      if (this.tDq != null) {
        this.tDq.setVisibility(8);
      }
      if (this.tDs != null) {
        this.tDs.setVisibility(8);
      }
      if (this.tCS != null) {
        this.tCS.setVisibility(8);
      }
      GMTrace.o(1050522157056L, 7827);
      return;
    }
    boolean bool = x.fw(this.iBi.field_username);
    label470:
    Object localObject;
    label515:
    int i;
    if (bool)
    {
      this.mOE.setText("");
      if (x.Tt(q.zE()).equals(this.iBi.field_username))
      {
        this.tDd.setVisibility(0);
        this.tDd.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(1040590045184L, 7753);
            com.tencent.mm.bj.d.x(NormalUserHeaderPreference.this.ezR, "bottle", ".ui.BottlePersonalInfoUI");
            GMTrace.o(1040590045184L, 7753);
          }
        });
      }
      this.oPn.setVisibility(0);
      this.tDi = true;
      if (this.iBi.fja != 1) {
        break label903;
      }
      this.oPn.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.cMN));
      this.oPn.setContentDescription(this.mContext.getString(R.l.dOK));
      if (this.iBi.field_verifyFlag != 0)
      {
        this.tCY.setVisibility(0);
        if (ak.a.gmZ == null) {
          break label978;
        }
        localObject = BackwardSupportUtil.b.c(ak.a.gmZ.fr(this.iBi.field_verifyFlag), 2.0F);
        this.tCY.setImageBitmap((Bitmap)localObject);
        if (localObject != null) {
          break label984;
        }
        i = 0;
        label531:
        this.tDf = i;
      }
      bbE();
      this.nLi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1056696172544L, 7873);
          paramAnonymousView = NormalUserHeaderPreference.this.iBi.field_username;
          com.tencent.mm.pluginsdk.ui.f localf = new com.tencent.mm.pluginsdk.ui.f(NormalUserHeaderPreference.this.ezR, paramAnonymousView);
          if (x.fw(paramAnonymousView)) {
            x.Tt(paramAnonymousView);
          }
          localf.bKN();
          GMTrace.o(1056696172544L, 7873);
        }
      });
      if (!x.Tq(this.iBi.field_username)) {
        break label993;
      }
      this.nLl.setText(this.mContext.getString(R.l.cSV) + this.iBi.vl());
      label608:
      if (!s.gf(this.iBi.field_username)) {
        break label1307;
      }
      this.tCT.setVisibility(0);
      label629:
      bMY();
      bMX();
      bMZ();
      if (!bg.nm(this.tDo)) {
        break label1319;
      }
      this.tCR.setVisibility(8);
      label660:
      this.tCV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1040992698368L, 7756);
          NormalUserHeaderPreference.this.tDk = false;
          paramAnonymousView = NormalUserHeaderPreference.this;
          at.AR();
          Object localObject = com.tencent.mm.y.c.yK().TE(paramAnonymousView.iBi.field_username);
          if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).fTq != 0) && (((com.tencent.mm.g.b.af)localObject).field_username.equals(paramAnonymousView.iBi.field_username))) {
            paramAnonymousView.iBi = ((x)localObject);
          }
          if (!com.tencent.mm.l.a.eE(paramAnonymousView.iBi.field_type))
          {
            localObject = new Intent();
            ((Intent)localObject).setClassName(paramAnonymousView.mContext, "com.tencent.mm.ui.contact.ModRemarkNameUI");
            ((Intent)localObject).putExtra("Contact_Scene", paramAnonymousView.oPH);
            ((Intent)localObject).putExtra("Contact_mode_name_type", 0);
            ((Intent)localObject).putExtra("Contact_ModStrangerRemark", true);
            ((Intent)localObject).putExtra("Contact_User", paramAnonymousView.iBi.field_username);
            ((Intent)localObject).putExtra("Contact_Nick", paramAnonymousView.iBi.field_nickname);
            ((Intent)localObject).putExtra("Contact_RemarkName", paramAnonymousView.iBi.field_conRemark);
            ((Activity)paramAnonymousView.mContext).startActivity((Intent)localObject);
            GMTrace.o(1040992698368L, 7756);
            return;
          }
          localObject = new Intent();
          ((Intent)localObject).setClassName(paramAnonymousView.mContext, "com.tencent.mm.ui.contact.ContactRemarkInfoModUI");
          ((Intent)localObject).putExtra("Contact_Scene", paramAnonymousView.oPH);
          ((Intent)localObject).putExtra("Contact_User", paramAnonymousView.iBi.field_username);
          ((Intent)localObject).putExtra("Contact_RoomNickname", paramAnonymousView.ezR.getIntent().getStringExtra("Contact_RoomNickname"));
          ((Activity)paramAnonymousView.mContext).startActivity((Intent)localObject);
          GMTrace.o(1040992698368L, 7756);
        }
      });
      this.tCW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1046361407488L, 7796);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("sns_permission_userName", NormalUserHeaderPreference.this.iBi.field_username);
          paramAnonymousView.putExtra("sns_permission_anim", true);
          paramAnonymousView.putExtra("sns_permission_block_scene", 3);
          com.tencent.mm.bj.d.b(NormalUserHeaderPreference.this.ezR, "sns", ".ui.SnsPermissionUI", paramAnonymousView);
          GMTrace.o(1046361407488L, 7796);
        }
      });
      i = j;
      if (this.tDi) {
        i = com.tencent.mm.br.a.fromDPToPix(this.ezR, 17) + 0;
      }
      j = this.tDf + i;
      i = j;
      if (this.tDg) {
        i = j + com.tencent.mm.br.a.fromDPToPix(this.ezR, 27);
      }
      j = i;
      if (this.tDh) {
        j = i + com.tencent.mm.br.a.fromDPToPix(this.ezR, 27);
      }
      i = j;
      if (this.tDj) {
        i = j + com.tencent.mm.br.a.fromDPToPix(this.ezR, 30);
      }
      if (!com.tencent.mm.br.a.ed(this.mContext)) {
        break label1419;
      }
      i += com.tencent.mm.br.a.fromDPToPix(this.ezR, 88);
    }
    for (;;)
    {
      j = com.tencent.mm.br.a.fromDPToPix(this.ezR, 60);
      localObject = this.ezR.getResources().getDisplayMetrics();
      this.mOE.setMaxWidth(((DisplayMetrics)localObject).widthPixels - (i + j));
      GMTrace.o(1050522157056L, 7827);
      return;
      this.mOE.setText(h.b(this.ezR, bg.nl(this.iBi.vj()) + " ", this.mOE.getTextSize()));
      break;
      label903:
      if (this.iBi.fja == 2)
      {
        this.oPn.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.cMM));
        this.oPn.setContentDescription(this.mContext.getString(R.l.dOJ));
        break label470;
      }
      if (this.iBi.fja != 0) {
        break label470;
      }
      this.oPn.setVisibility(8);
      this.tDi = false;
      break label470;
      label978:
      localObject = null;
      break label515;
      label984:
      i = ((Bitmap)localObject).getWidth();
      break label531;
      label993:
      if (x.To(this.iBi.field_username))
      {
        this.nLl.setText(this.mContext.getString(R.l.cTe) + this.iBi.vl());
        break label608;
      }
      if (this.nNi)
      {
        if (com.tencent.mm.l.a.eE(this.iBi.field_type))
        {
          bMW();
          break label608;
        }
        if ((this.iBi.fjm == null) || (this.iBi.fjm.equals("")))
        {
          this.nLl.setText(R.l.cSG);
          break label608;
        }
        this.nLl.setText(this.iBi.fjm);
        break label608;
      }
      if (bool)
      {
        this.nLl.setText((bg.nl(r.fu(this.iBi.getProvince())) + " " + bg.nl(this.iBi.getCity())).trim());
        break label608;
      }
      if ((!x.Tp(this.iBi.field_username)) && (this.ezR.getIntent().getBooleanExtra("Contact_ShowUserName", true)))
      {
        if ((bg.nm(this.iBi.qQ())) && ((x.aV(this.iBi.field_username, true)) || (s.fB(this.iBi.field_username))))
        {
          this.nLl.setVisibility(8);
          break label608;
        }
        if (com.tencent.mm.l.a.eE(this.iBi.field_type))
        {
          bMW();
          break label608;
        }
      }
      this.nLl.setVisibility(8);
      break label608;
      label1307:
      this.tCT.setVisibility(8);
      break label629;
      label1319:
      if ((!q.fp(this.iBi.field_username)) && (bg.nl(this.iBi.field_conRemark).length() > 0)) {
        this.nLl.setVisibility(8);
      }
      this.tCR.setVisibility(0);
      this.tCR.setText(h.b(this.ezR, this.ezR.getString(R.l.diX) + this.tDo, this.tCR.getTextSize()));
      break label660;
      label1419:
      i += com.tencent.mm.br.a.fromDPToPix(this.ezR, 64);
    }
  }
  
  private void bMW()
  {
    GMTrace.i(1050656374784L, 7828);
    x.bSz();
    this.nLl.setVisibility(0);
    if (!bg.nm(this.iBi.qQ()))
    {
      this.nLl.setText(this.mContext.getString(R.l.cTa) + this.iBi.qQ());
      GMTrace.o(1050656374784L, 7828);
      return;
    }
    if ((!x.aV(this.iBi.field_username, true)) && (!s.fB(this.iBi.field_username)))
    {
      String str = bg.nl(this.iBi.vl());
      this.nLl.setText(this.mContext.getString(R.l.cTa) + str);
      GMTrace.o(1050656374784L, 7828);
      return;
    }
    this.nLl.setVisibility(8);
    GMTrace.o(1050656374784L, 7828);
  }
  
  private void bbE()
  {
    GMTrace.i(1050387939328L, 7826);
    a.b.a(this.nLi, this.iBi.field_username);
    int i;
    if (this.nLi != null)
    {
      i = com.tencent.mm.br.a.V(this.mContext, R.f.aPw);
      int j = com.tencent.mm.br.a.fromDPToPix(this.ezR, 88);
      if (i <= j) {
        break label103;
      }
      i = j;
    }
    label103:
    for (;;)
    {
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(i, i);
      localLayoutParams.setMargins(0, 0, com.tencent.mm.br.a.W(this.mContext, R.f.aQr), 0);
      this.nLi.setLayoutParams(localLayoutParams);
      GMTrace.o(1050387939328L, 7826);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(1051864334336L, 7837);
    w.d("MicroMsg.ContactInfoHeader", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.e("MicroMsg.ContactInfoHeader", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(1051864334336L, 7837);
      return;
    }
    paramm = (String)paramObject;
    w.d("MicroMsg.ContactInfoHeader", "onNotifyChange username = " + paramm + ", contact = " + this.iBi);
    if (!aXB())
    {
      w.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.kEu + "contact = " + this.iBi);
      GMTrace.o(1051864334336L, 7837);
      return;
    }
    if (bg.nl(paramm).length() <= 0)
    {
      GMTrace.o(1051864334336L, 7837);
      return;
    }
    if ((this.iBi != null) && (this.iBi.field_username.equals(paramm)))
    {
      at.AR();
      this.iBi = com.tencent.mm.y.c.yK().TE(paramm);
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          int j = 0;
          GMTrace.i(1041261133824L, 7758);
          NormalUserHeaderPreference.this.bMY();
          NormalUserHeaderPreference.this.bMZ();
          NormalUserHeaderPreference.this.bMX();
          Object localObject;
          if (NormalUserHeaderPreference.this.tDe != null)
          {
            localObject = NormalUserHeaderPreference.this.tDe;
            if (!com.tencent.mm.l.a.eE(NormalUserHeaderPreference.this.iBi.field_type)) {}
            for (boolean bool = true;; bool = false)
            {
              i = ((FMessageListView)localObject).getChildCount();
              w.d("MicroMsg.FMessageListView", "setReplyBtnVisible, visible = " + bool + ", current child count = " + i);
              if (i > 2) {
                break;
              }
              w.e("MicroMsg.FMessageListView", "setReplyBtnVisible fail, childCount invalid = " + i);
              GMTrace.o(1041261133824L, 7758);
              return;
            }
            if (((FMessageListView)localObject).tCD != null)
            {
              FMessageListView.a locala = ((FMessageListView)localObject).tCD;
              if (!bool) {
                break label210;
              }
              i = 0;
              locala.setVisibility(i);
            }
            if (((FMessageListView)localObject).tCE != null)
            {
              localObject = ((FMessageListView)localObject).tCE;
              if (!bool) {
                break label216;
              }
            }
          }
          label210:
          label216:
          for (int i = j;; i = 8)
          {
            ((a)localObject).setVisibility(i);
            GMTrace.o(1041261133824L, 7758);
            return;
            i = 8;
            break;
          }
        }
      });
    }
    GMTrace.o(1051864334336L, 7837);
  }
  
  public final void a(final bb parambb)
  {
    GMTrace.i(1051998552064L, 7838);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1047032496128L, 7801);
        if ((NormalUserHeaderPreference.this.iBi != null) && (parambb != null) && (NormalUserHeaderPreference.this.iBi.field_username.equals(parambb.field_encryptUsername)))
        {
          NormalUserHeaderPreference.this.iBi.cj(parambb.field_conRemark);
          if (!NormalUserHeaderPreference.this.aXB())
          {
            w.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + NormalUserHeaderPreference.this.kEu + "contact = " + NormalUserHeaderPreference.this.iBi.field_username);
            GMTrace.o(1047032496128L, 7801);
            return;
          }
          NormalUserHeaderPreference.this.bMY();
        }
        GMTrace.o(1047032496128L, 7801);
      }
    });
    GMTrace.o(1051998552064L, 7838);
  }
  
  public final void a(x paramx, int paramInt, String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(1051059027968L, 7831);
    onDetach();
    at.AR();
    com.tencent.mm.y.c.yK().a(this);
    at.AR();
    com.tencent.mm.y.c.yL().a(this);
    com.tencent.mm.ac.n.Dh().d(this);
    this.iBi = paramx;
    this.oPH = paramInt;
    this.nLA = paramString;
    this.nNi = this.ezR.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
    this.tDn = this.ezR.getIntent().getBooleanExtra("Contact_ShowFMessageList", false);
    this.tDk = this.ezR.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
    this.tDl = this.ezR.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
    this.tDm = this.ezR.getIntent().getBooleanExtra("Contact_AlwaysShowRemarkBtn", false);
    this.nOr = this.ezR.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
    this.tDo = this.ezR.getIntent().getStringExtra("Contact_RoomNickname");
    if (paramx.field_deleteFlag == 1)
    {
      bool1 = true;
      this.nNp = bool1;
      if (bg.nl(paramx.field_username).length() <= 0) {
        break label251;
      }
    }
    label251:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue("initView: contact username is null", bool1);
      MP();
      GMTrace.o(1051059027968L, 7831);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void aS(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1050790592512L, 7829);
    if ((paramString != null) && (paramString.equals(this.iBi.field_username))) {
      this.tDk = paramBoolean;
    }
    GMTrace.o(1050790592512L, 7829);
  }
  
  public final void aT(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1050924810240L, 7830);
    if ((paramString != null) && (paramString.equals(this.iBi.field_username))) {
      this.tDl = paramBoolean;
    }
    GMTrace.o(1050924810240L, 7830);
  }
  
  public final boolean aXB()
  {
    GMTrace.i(1050253721600L, 7825);
    if ((this.kEu) && (this.iBi != null))
    {
      GMTrace.o(1050253721600L, 7825);
      return true;
    }
    GMTrace.o(1050253721600L, 7825);
    return false;
  }
  
  public final void bMX()
  {
    int j = 0;
    GMTrace.i(1051327463424L, 7833);
    Object localObject;
    boolean bool;
    if ((this.tDa != null) && (s.fv(this.iBi.field_username)))
    {
      this.tDh = this.iBi.ve();
      localObject = this.tDa;
      if (this.tDh)
      {
        i = 0;
        ((ImageView)localObject).setVisibility(i);
      }
    }
    else if ((this.tDb != null) && (s.fv(this.iBi.field_username)))
    {
      localObject = this.iBi.field_username;
      if (com.tencent.mm.plugin.sns.b.n.poR == null) {
        break label154;
      }
      bool = com.tencent.mm.plugin.sns.b.n.poR.T((String)localObject, 5L);
      label112:
      this.tDg = bool;
      localObject = this.tDb;
      if (!this.tDg) {
        break label159;
      }
    }
    label154:
    label159:
    for (int i = j;; i = 8)
    {
      ((ImageView)localObject).setVisibility(i);
      GMTrace.o(1051327463424L, 7833);
      return;
      i = 8;
      break;
      bool = false;
      break label112;
    }
  }
  
  public final void bMY()
  {
    GMTrace.i(1051461681152L, 7834);
    if ((q.fp(this.iBi.field_username)) || (bg.nl(this.iBi.field_conRemark).length() <= 0))
    {
      this.tCS.setVisibility(8);
      this.mOE.setText(h.b(this.ezR, bg.nl(this.iBi.vj()) + " ", this.mOE.getTextSize()));
      if (this.tDm)
      {
        this.tCV.setVisibility(0);
        this.tDs.setVisibility(8);
        if ((!this.nOr) || (com.tencent.mm.l.a.eE(this.iBi.field_type))) {
          break label537;
        }
        this.tCW.setVisibility(0);
      }
    }
    for (;;)
    {
      if (x.fw(this.iBi.field_username)) {
        this.mOE.setText("");
      }
      if ((this.oPH == 76) && (this.iBi.field_username != null) && (this.iBi.field_username.endsWith("@stranger"))) {
        this.mOE.setText(h.b(this.ezR, bg.nl(this.iBi.field_nickname) + " ", this.mOE.getTextSize()));
      }
      if ((this.tCW.getVisibility() == 0) && (this.tCS.getVisibility() == 0))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.tCS.getLayoutParams();
        localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aQN);
        this.tCS.setLayoutParams(localLayoutParams);
      }
      GMTrace.o(1051461681152L, 7834);
      return;
      if (this.tDk)
      {
        this.tCV.setVisibility(0);
        this.tDs.setVisibility(8);
        break;
      }
      if (com.tencent.mm.l.a.eE(this.iBi.field_type)) {
        this.tCV.setVisibility(8);
      }
      boolean bool1 = this.tDq.L(this.iBi);
      boolean bool2 = this.tDr.L(this.iBi);
      if ((!bool1) && (!bool2)) {
        break;
      }
      this.tDs.setVisibility(8);
      break;
      this.mOE.setText(h.b(this.ezR, bg.nl(this.iBi.field_conRemark) + " ", this.mOE.getTextSize()));
      this.tCS.setVisibility(0);
      this.tCS.setText(h.b(this.ezR, this.mContext.getString(R.l.dkd) + this.iBi.vj(), this.tCS.getTextSize()));
      this.tCV.setVisibility(8);
      break;
      label537:
      if (this.tDl)
      {
        this.tCW.setVisibility(0);
        if (com.tencent.mm.br.a.ed(this.ezR))
        {
          this.tCW.setTextSize(0, this.ezR.getResources().getDimensionPixelSize(R.f.aQo));
          this.tCV.setTextSize(0, this.ezR.getResources().getDimensionPixelSize(R.f.aQo));
        }
      }
      else
      {
        this.tCW.setVisibility(8);
      }
    }
  }
  
  public final void bMZ()
  {
    GMTrace.i(1051595898880L, 7835);
    this.tCZ.setClickable(false);
    if ((s.fv(this.iBi.field_username)) && (com.tencent.mm.l.a.eE(this.iBi.field_type)) && (!q.fp(this.iBi.field_username)))
    {
      this.tCZ.setVisibility(0);
      if (this.iBi.vb())
      {
        this.tCZ.setChecked(true);
        this.tDj = true;
        GMTrace.o(1051595898880L, 7835);
        return;
      }
      this.tCZ.setChecked(false);
      this.tCZ.setVisibility(8);
      this.tDj = false;
      GMTrace.o(1051595898880L, 7835);
      return;
    }
    this.tDj = false;
    this.tCZ.setVisibility(8);
    GMTrace.o(1051595898880L, 7835);
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(1051730116608L, 7836);
    if (!aXB())
    {
      w.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.kEu + "contact = " + this.iBi);
      GMTrace.o(1051730116608L, 7836);
      return;
    }
    if (bg.nl(paramString).length() <= 0)
    {
      w.e("MicroMsg.ContactInfoHeader", "notifyChanged: user = " + paramString);
      GMTrace.o(1051730116608L, 7836);
      return;
    }
    if (paramString.equals(this.iBi.field_username)) {
      MP();
    }
    GMTrace.o(1051730116608L, 7836);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(1050119503872L, 7824);
    w.d("MicroMsg.ContactInfoHeader", "onBindView");
    this.mOE = ((TextView)paramView.findViewById(R.h.bqQ));
    this.nLl = ((TextView)paramView.findViewById(R.h.brh));
    this.tCX = ((TextView)paramView.findViewById(R.h.bqr));
    this.tCR = ((TextView)paramView.findViewById(R.h.bqw));
    this.tCS = ((TextView)paramView.findViewById(R.h.bqR));
    this.tCV = ((Button)paramView.findViewById(R.h.bqW));
    this.tCW = ((Button)paramView.findViewById(R.h.bre));
    this.tDp = ((ProfileMobilePhoneView)paramView.findViewById(R.h.bNQ));
    Object localObject = this.tDp;
    at.AR();
    ((ProfileMobilePhoneView)localObject).tur = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsi, Boolean.valueOf(false))).booleanValue();
    this.tDq = ((ProfileDescribeView)paramView.findViewById(R.h.bth));
    this.tDr = ((ProfileLabelView)paramView.findViewById(R.h.bJq));
    this.tDs = ((TextView)paramView.findViewById(R.h.ccr));
    this.tDq.setOnClickListener(this.tDt);
    this.tDr.setOnClickListener(this.tDt);
    this.tDs.setOnClickListener(this.tDt);
    if ((q.fp(this.iBi.field_username)) || ((!bg.nm(this.iBi.field_username)) && (s.gf(this.iBi.field_username))))
    {
      this.tDs.setVisibility(8);
      this.tDp.setVisibility(8);
      this.tDq.setVisibility(8);
      this.tDr.setVisibility(8);
      this.tCT = ((TextView)paramView.findViewById(R.h.bqE));
      this.tDd = ((Button)paramView.findViewById(R.h.bqA));
      this.tDe = ((FMessageListView)paramView.findViewById(R.h.bqB));
      localObject = new a.a();
      ((a.a)localObject).eDs = this.iBi.field_username;
      ((a.a)localObject).scene = this.oPH;
      ((a.a)localObject).nLA = this.nLA;
      ((a.a)localObject).type = 0;
      if (this.oPH != 18) {
        break label882;
      }
      ((a.a)localObject).type = 1;
      label415:
      this.tDe.tCu = ((a.a)localObject);
      a.tCu = (a.a)localObject;
      this.tCU = paramView.findViewById(R.h.cfh);
      this.tDc = ((LinearLayout)paramView.findViewById(R.h.bFQ));
      this.nLi = ((ImageView)paramView.findViewById(R.h.bqt));
      this.oPn = ((ImageView)paramView.findViewById(R.h.brb));
      this.tCY = ((ImageView)paramView.findViewById(R.h.brn));
      this.tCZ = ((CheckBox)paramView.findViewById(R.h.brf));
      this.tDa = ((ImageView)paramView.findViewById(R.h.brd));
      this.tDb = ((ImageView)paramView.findViewById(R.h.brc));
      this.kEu = true;
      MP();
      if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {
        break label901;
      }
      w.d("MicroMsg.ContactInfoHeader", "initAddContent, showFMessageList false");
      this.tDe.setVisibility(8);
      if ((this.tDe.getVisibility() == 8) && (this.tDs.getVisibility() == 8) && (this.tDr.getVisibility() == 8) && (this.tDq.getVisibility() == 8) && (this.tCT.getVisibility() == 8)) {
        this.tCU.setVisibility(8);
      }
    }
    for (;;)
    {
      super.onBindView(paramView);
      GMTrace.o(1050119503872L, 7824);
      return;
      localObject = this.tDp;
      String str1 = this.tuh;
      String str2 = this.tui;
      w.i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", new Object[] { str1, str2 });
      ((ProfileMobilePhoneView)localObject).tuh = str1;
      ((ProfileMobilePhoneView)localObject).tui = str2;
      ((ProfileMobilePhoneView)localObject).aXX();
      if (!com.tencent.mm.l.a.eE(this.iBi.field_type)) {
        this.tDp.setVisibility(8);
      }
      for (;;)
      {
        boolean bool1 = this.tDq.L(this.iBi);
        boolean bool2 = this.tDr.L(this.iBi);
        if ((!bool1) && (!bool2)) {
          break label803;
        }
        this.tDs.setVisibility(8);
        break;
        this.tDp.setVisibility(0);
      }
      label803:
      if ((this.tDm) || (this.tDk)) {
        this.tDs.setVisibility(8);
      }
      for (;;)
      {
        if ((this.tDu == null) || ((!this.tDu.equals("ContactWidgetBottleContact")) && (!this.tDu.equals("ContactWidgetQContact")))) {
          break label880;
        }
        this.tDs.setVisibility(8);
        break;
        this.tDs.setVisibility(0);
      }
      label880:
      break;
      label882:
      if (!bc.fv(this.oPH)) {
        break label415;
      }
      ((a.a)localObject).type = 2;
      break label415;
      label901:
      if ((this.nLA == null) || (this.nLA.length() == 0))
      {
        w.d("MicroMsg.ContactInfoHeader", "initAddContent, FMessageListView gone, addScene = " + this.oPH + ", verifyTicket = " + this.nLA);
        this.tDe.setVisibility(8);
        if ((this.tDe.getVisibility() == 8) && (this.tDs.getVisibility() == 8) && (this.tDr.getVisibility() == 8) && (this.tDq.getVisibility() == 8) && (this.tCT.getVisibility() == 8)) {
          this.tCU.setVisibility(8);
        }
      }
      else
      {
        w.d("MicroMsg.ContactInfoHeader", "initAddContent, scene = " + this.oPH);
        if (this.oPH == 18)
        {
          w.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is lbs");
          localObject = l.MM().lS(this.iBi.field_username);
          localObject = b.a(this.ezR, (bz[])localObject);
        }
        for (;;)
        {
          if ((localObject != null) && (localObject.length != 0)) {
            break label1289;
          }
          w.e("MicroMsg.ContactInfoHeader", "initAddContent, providerList is null");
          this.tDe.setVisibility(8);
          if ((this.tDe.getVisibility() != 8) || (this.tDs.getVisibility() != 8) || (this.tDr.getVisibility() != 8) || (this.tDq.getVisibility() != 8) || (this.tCT.getVisibility() != 8)) {
            break;
          }
          this.tCU.setVisibility(8);
          break;
          if (bc.fv(this.oPH))
          {
            w.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is shake");
            localObject = l.MN().lX(this.iBi.field_username);
            localObject = b.a(this.ezR, (j[])localObject);
          }
          else
          {
            w.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is other");
            localObject = l.MK().lN(this.iBi.field_username);
            localObject = b.a(this.ezR, (com.tencent.mm.bc.f[])localObject);
          }
        }
        label1289:
        w.d("MicroMsg.ContactInfoHeader", "initAddContent, providerList size = " + localObject.length);
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          str1 = localObject[i];
          if (str1 != null) {
            w.d("MicroMsg.ContactInfoHeader", "initAddContent, username = " + str1.username + ", nickname = " + str1.eCQ + ", digest = " + str1.glz + ", addScene = " + str1.oPH);
          }
          i += 1;
        }
        this.tDe.setVisibility(0);
        if ((this.tDe.getVisibility() == 0) || (this.tDs.getVisibility() == 0) || (this.tDr.getVisibility() == 0) || (this.tDq.getVisibility() == 0) || (this.tCT.getVisibility() == 0)) {
          this.tCU.setVisibility(0);
        }
        j = localObject.length;
        i = 0;
        while (i < j)
        {
          str1 = localObject[i];
          this.tDe.a(str1);
          i += 1;
        }
      }
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1049985286144L, 7823);
    if (this.tDe != null) {
      this.tDe.detach();
    }
    paramViewGroup = super.onCreateView(paramViewGroup);
    GMTrace.o(1049985286144L, 7823);
    return paramViewGroup;
  }
  
  public final void onDetach()
  {
    GMTrace.i(1051193245696L, 7832);
    if (this.tDe != null) {
      this.tDe.detach();
    }
    if (this.tDn) {
      l.ML().lK(this.iBi.field_username);
    }
    this.ezR.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.tDk);
    this.ezR.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.tDl);
    at.AR();
    com.tencent.mm.y.c.yK().b(this);
    com.tencent.mm.ac.n.Dh().e(this);
    at.AR();
    com.tencent.mm.y.c.yL().b(this);
    GMTrace.o(1051193245696L, 7832);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\NormalUserHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */