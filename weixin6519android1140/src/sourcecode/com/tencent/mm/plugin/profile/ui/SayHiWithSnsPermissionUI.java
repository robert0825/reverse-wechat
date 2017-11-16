package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.pluginsdk.ui.d.i;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SayHiWithSnsPermissionUI
  extends MMActivity
  implements e
{
  private String aDn;
  private String aDo;
  private String chatroomName;
  private ProgressDialog htG;
  private int[] mGp;
  private String mvZ;
  private int nLz;
  private EditText nOS;
  private EditText nOT;
  private View nOU;
  private TextView nOV;
  private MMSwitchBtn nOW;
  private boolean nOX;
  private boolean nOY;
  private boolean nOZ;
  private TextView nPa;
  private MMTagPanel nPb;
  private List<String> nPc;
  private m.b nPd;
  private CharSequence nPe;
  private String ntu;
  private String userName;
  
  public SayHiWithSnsPermissionUI()
  {
    GMTrace.i(6810073300992L, 50739);
    this.htG = null;
    this.mGp = new int[8];
    this.nPd = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(6800543842304L, 50668);
        SayHiWithSnsPermissionUI.a(SayHiWithSnsPermissionUI.this);
        GMTrace.o(6800543842304L, 50668);
      }
    };
    this.nPe = null;
    GMTrace.o(6810073300992L, 50739);
  }
  
  private void aXY()
  {
    GMTrace.i(6811012825088L, 50746);
    at.AR();
    bb localbb = com.tencent.mm.y.c.yL().CC(this.userName);
    if (localbb != null)
    {
      this.mvZ = localbb.field_contactLabels;
      this.nPc = ((ArrayList)com.tencent.mm.plugin.label.a.a.aJP().AW(this.mvZ));
    }
    if (this.nOZ)
    {
      if (!bg.nm(this.mvZ))
      {
        this.nPb.setVisibility(0);
        this.nPa.setVisibility(4);
        this.nPb.a(this.nPc, this.nPc);
        GMTrace.o(6811012825088L, 50746);
        return;
      }
      this.nPb.setVisibility(4);
      this.nPa.setVisibility(0);
    }
    GMTrace.o(6811012825088L, 50746);
  }
  
  protected final void MP()
  {
    GMTrace.i(6810878607360L, 50745);
    this.nOW = ((MMSwitchBtn)findViewById(R.h.bRo).findViewById(R.h.checkbox));
    this.nOW.mK(false);
    this.nOX = getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false);
    this.nOY = getIntent().getBooleanExtra("sayhi_with_sns_perm_add_remark", false);
    this.nOZ = getIntent().getBooleanExtra("sayhi_with_sns_perm_set_label", false);
    this.userName = getIntent().getStringExtra("Contact_User");
    this.nLz = getIntent().getIntExtra("Contact_Scene", 9);
    this.chatroomName = getIntent().getStringExtra("room_name");
    this.aDo = getIntent().getStringExtra("Contact_RemarkName");
    this.aDn = getIntent().getStringExtra("Contact_Nick");
    this.ntu = getIntent().getStringExtra("Contact_RoomNickname");
    this.nOU = findViewById(R.h.bOb);
    this.nOV = ((TextView)findViewById(R.h.bOc));
    sq(getString(R.l.app_name));
    String str1;
    Object localObject2;
    Object localObject1;
    if (this.nOX)
    {
      sq(getString(R.l.dXI));
      this.nOS = ((EditText)findViewById(R.h.bZq));
      this.nOS.setMinHeight(this.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQv));
      com.tencent.mm.ui.tools.a.c.d(this.nOS).Ea(100).a(null);
      this.nOS.setFilters(com.tencent.mm.pluginsdk.ui.tools.h.tGZ);
      ((LinearLayout)this.nOS.getParent()).setVisibility(0);
      at.AR();
      str1 = (String)com.tencent.mm.y.c.xh().get(294913, null);
      localObject2 = q.zG();
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "";
      }
      String str2 = getString(R.l.dXD);
      localObject2 = localObject1;
      if (str2.length() + ((String)localObject1).length() > 50) {
        localObject2 = ((String)localObject1).substring(0, 50 - str2.length());
      }
      this.nPe = com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, String.format(str2, new Object[] { localObject2 }), this.nOS.getTextSize());
      if (!bg.nm(str1)) {
        break label835;
      }
      this.nOS.setText(this.nPe);
    }
    for (;;)
    {
      this.nOS.requestFocus();
      this.nOS.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6808462688256L, 50727);
          SayHiWithSnsPermissionUI.this.aLs();
          GMTrace.o(6808462688256L, 50727);
        }
      }, 100L);
      if (this.nOY)
      {
        this.nOT = ((EditText)findViewById(R.h.bZt));
        ((LinearLayout)this.nOT.getParent()).setVisibility(0);
        if (!this.nOX) {
          this.nOT.clearFocus();
        }
        this.nOT.setMinHeight(this.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQv));
        com.tencent.mm.ui.tools.a.c.d(this.nOT).Ea(100).a(null);
        this.nOT.setFilters(com.tencent.mm.pluginsdk.ui.tools.h.tGZ);
        if (!this.nOX)
        {
          this.mGp[0] = 1;
          sq(getString(R.l.dlP));
          localObject1 = (LinearLayout.LayoutParams)((View)this.nOT.getParent()).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject1).setMargins(((LinearLayout.LayoutParams)localObject1).leftMargin, 0, ((LinearLayout.LayoutParams)localObject1).rightMargin, ((LinearLayout.LayoutParams)localObject1).bottomMargin);
        }
        if (bg.nm(this.aDo)) {
          break;
        }
        this.nOT.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, this.aDo, this.nOT.getTextSize()));
        this.mGp[6] = 1;
      }
      if (this.nOZ)
      {
        this.nPa = ((TextView)findViewById(R.h.bNX));
        this.nPb = ((MMTagPanel)findViewById(R.h.bro));
        this.nPb.lNJ = false;
        ((LinearLayout)((FrameLayout)this.nPb.getParent()).getParent()).setVisibility(0);
        this.nPa.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6754507161600L, 50325);
            SayHiWithSnsPermissionUI.c(SayHiWithSnsPermissionUI.this);
            GMTrace.o(6754507161600L, 50325);
          }
        });
        this.nPb.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6753164984320L, 50315);
            SayHiWithSnsPermissionUI.c(SayHiWithSnsPermissionUI.this);
            GMTrace.o(6753164984320L, 50315);
          }
        });
      }
      aXY();
      if (!bg.nm(this.mvZ)) {
        this.mGp[7] = 1;
      }
      localObject1 = getString(R.l.cUs);
      if (!this.nOX) {
        localObject1 = getString(R.l.cTh);
      }
      a(0, (String)localObject1, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6768868458496L, 50432);
          Object localObject1;
          Object localObject2;
          HashMap localHashMap;
          if (SayHiWithSnsPermissionUI.d(SayHiWithSnsPermissionUI.this))
          {
            paramAnonymousMenuItem = new LinkedList();
            paramAnonymousMenuItem.add(SayHiWithSnsPermissionUI.e(SayHiWithSnsPermissionUI.this));
            localObject1 = new LinkedList();
            ((LinkedList)localObject1).add(Integer.valueOf(SayHiWithSnsPermissionUI.f(SayHiWithSnsPermissionUI.this)));
            localObject2 = SayHiWithSnsPermissionUI.g(SayHiWithSnsPermissionUI.this);
            localHashMap = new HashMap();
            if (!SayHiWithSnsPermissionUI.h(SayHiWithSnsPermissionUI.this).xrA) {
              break label388;
            }
          }
          label388:
          for (int i = 1;; i = 0)
          {
            localHashMap.put(SayHiWithSnsPermissionUI.e(SayHiWithSnsPermissionUI.this), Integer.valueOf(i));
            w.d("MicroMsg.SayHiWithSnsPermissionUI", "select sns permission, %s", new Object[] { Integer.valueOf(i) });
            paramAnonymousMenuItem = new com.tencent.mm.pluginsdk.model.n(paramAnonymousMenuItem, (List)localObject1, (String)localObject2, "", localHashMap, SayHiWithSnsPermissionUI.i(SayHiWithSnsPermissionUI.this));
            localObject1 = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("source_from_user_name");
            localObject2 = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("source_from_nick_name");
            if (!bg.nm((String)localObject1)) {
              paramAnonymousMenuItem.eC((String)localObject1, (String)localObject2);
            }
            at.wS().a(paramAnonymousMenuItem, 0);
            localObject1 = SayHiWithSnsPermissionUI.this;
            localObject2 = SayHiWithSnsPermissionUI.this.vKB.vKW;
            SayHiWithSnsPermissionUI.this.getString(R.l.cUG);
            SayHiWithSnsPermissionUI.a((SayHiWithSnsPermissionUI)localObject1, com.tencent.mm.ui.base.h.a((Context)localObject2, SayHiWithSnsPermissionUI.this.getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(6802154455040L, 50680);
                at.wS().c(paramAnonymousMenuItem);
                GMTrace.o(6802154455040L, 50680);
              }
            }));
            for (;;)
            {
              GMTrace.o(6768868458496L, 50432);
              return false;
              if (SayHiWithSnsPermissionUI.j(SayHiWithSnsPermissionUI.this))
              {
                paramAnonymousMenuItem = SayHiWithSnsPermissionUI.this.getIntent().getStringExtra("Verify_ticket");
                paramAnonymousMenuItem = new com.tencent.mm.pluginsdk.model.n(SayHiWithSnsPermissionUI.e(SayHiWithSnsPermissionUI.this), paramAnonymousMenuItem, SayHiWithSnsPermissionUI.f(SayHiWithSnsPermissionUI.this));
                at.wS().a(paramAnonymousMenuItem, 0);
                localObject1 = SayHiWithSnsPermissionUI.this;
                localObject2 = SayHiWithSnsPermissionUI.this.vKB.vKW;
                SayHiWithSnsPermissionUI.this.getString(R.l.cUG);
                SayHiWithSnsPermissionUI.a((SayHiWithSnsPermissionUI)localObject1, com.tencent.mm.ui.base.h.a((Context)localObject2, SayHiWithSnsPermissionUI.this.getString(R.l.djf), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(6742964436992L, 50239);
                    at.wS().c(paramAnonymousMenuItem);
                    GMTrace.o(6742964436992L, 50239);
                  }
                }));
              }
            }
          }
        }
      }, p.b.vLG);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6742024912896L, 50232);
          if (SayHiWithSnsPermissionUI.j(SayHiWithSnsPermissionUI.this)) {
            SayHiWithSnsPermissionUI.k(SayHiWithSnsPermissionUI.this)[1] = 1;
          }
          SayHiWithSnsPermissionUI.this.finish();
          GMTrace.o(6742024912896L, 50232);
          return true;
        }
      });
      GMTrace.o(6810878607360L, 50745);
      return;
      label835:
      localObject1 = com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, str1, this.nOS.getTextSize());
      this.nOS.setText((CharSequence)localObject1);
    }
    if (!bg.nm(this.aDn))
    {
      this.nOT.setHint(com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, this.aDn, this.nOT.getTextSize()));
      this.nOT.setOnFocusChangeListener(new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(6760010088448L, 50366);
          if ((paramAnonymousBoolean) && (!bg.L(SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).getHint())) && (bg.L(SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).getText())))
          {
            SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).setText(SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).getHint());
            SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).setOnFocusChangeListener(null);
            SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).setHint(null);
          }
          GMTrace.o(6760010088448L, 50366);
        }
      });
    }
    int i;
    switch (this.nLz)
    {
    case 9: 
    case 12: 
    default: 
      i = 0;
    }
    while ((!this.nOX) && (i == 0))
    {
      localObject1 = l.MK().lP(this.userName);
      if (localObject1 == null) {
        break;
      }
      localObject2 = com.tencent.mm.pluginsdk.ui.preference.b.a(this, (f)localObject1);
      if ((bg.nm(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz)) || (((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz.equals(getString(R.l.dwk)))) {
        break;
      }
      str1 = getString(R.l.dXD).substring(0, getString(R.l.dXD).indexOf("%s"));
      localObject1 = ((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz;
      if (((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz.startsWith(str1)) {
        localObject1 = ((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz.substring(str1.length());
      }
      this.nOU.setVisibility(0);
      this.nOV.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, bg.nl(getString(R.l.dkM, new Object[] { ((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz })), this.nOV.getTextSize()));
      localObject2 = new i(getString(R.l.ela));
      ((i)localObject2).setSpan(new a((String)localObject1), 0, ((i)localObject2).length(), 17);
      this.nOV.append(" ");
      this.nOV.append((CharSequence)localObject2);
      this.nOV.setMovementMethod(LinkMovementMethod.getInstance());
      this.mGp[3] = 3;
      break;
      localObject1 = af.If().jJ(this.userName);
      if ((localObject1 == null) || (bg.nm(((com.tencent.mm.modelfriend.b)localObject1).GU())) || (((com.tencent.mm.modelfriend.b)localObject1).GU().equals(this.nOT.getText().toString())))
      {
        i = 0;
      }
      else
      {
        this.nOU.setVisibility(0);
        this.nOV.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, bg.nl(getString(R.l.dkL, new Object[] { ((com.tencent.mm.modelfriend.b)localObject1).GU() })), this.nOV.getTextSize()));
        localObject2 = new i(getString(R.l.ela));
        ((i)localObject2).setSpan(new a(((com.tencent.mm.modelfriend.b)localObject1).GU()), 0, ((i)localObject2).length(), 17);
        this.nOV.append(" ");
        this.nOV.append((CharSequence)localObject2);
        this.nOV.setMovementMethod(LinkMovementMethod.getInstance());
        this.mGp[3] = 1;
        i = 1;
        continue;
        if ((bg.nm(this.ntu)) || (this.ntu.equals(this.nOT.getText().toString())))
        {
          i = 0;
        }
        else
        {
          this.nOU.setVisibility(0);
          this.nOV.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, bg.nl(getString(R.l.dkK, new Object[] { this.ntu })), this.nOV.getTextSize()));
          localObject1 = new i(getString(R.l.ela));
          ((i)localObject1).setSpan(new a(this.ntu), 0, ((i)localObject1).length(), 17);
          this.nOV.append(" ");
          this.nOV.append((CharSequence)localObject1);
          this.nOV.setMovementMethod(LinkMovementMethod.getInstance());
          this.mGp[3] = 2;
          i = 1;
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 1;
    GMTrace.i(6811147042816L, 50747);
    w.i("MicroMsg.SayHiWithSnsPermissionUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    Object localObject;
    for (;;)
    {
      try
      {
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        if (!this.nOX) {
          break;
        }
        localObject = this.nOS.getText().toString().trim();
        if ((bg.nm((String)localObject)) || (((String)localObject).equals(this.nPe)))
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(294913, "");
        }
        switch (paramInt2)
        {
        default: 
          i = 0;
          if (i == 0) {
            break label269;
          }
          GMTrace.o(6811147042816L, 50747);
          return;
          at.AR();
          com.tencent.mm.y.c.xh().set(294913, localObject);
          break;
        case -22: 
          Toast.makeText(this, R.l.dXF, 0).show();
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SayHiWithSnsPermissionUI", "exception in onSceneEnd : " + paramString.getMessage());
        GMTrace.o(6811147042816L, 50747);
        return;
      }
      continue;
      Toast.makeText(this, R.l.dwo, 0).show();
    }
    label269:
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.ui.base.h.bm(this, getString(R.l.dXG));
      paramInt1 = ((com.tencent.mm.pluginsdk.model.n)paramk).eHJ;
      if (this.nOY)
      {
        paramString = "";
        if (this.nOT.getText() != null) {
          paramString = this.nOT.getText().toString();
        }
        localObject = paramString;
        if (!bg.nm(paramString))
        {
          localObject = paramString;
          if (paramString.length() > 50) {
            localObject = paramString.substring(0, 50);
          }
        }
        if (bg.nm((String)localObject)) {
          break label794;
        }
        at.AR();
        paramString = com.tencent.mm.y.c.yK().TE(this.userName);
        paramString.cj((String)localObject);
        at.AR();
        bb localbb = com.tencent.mm.y.c.yL().CC(this.userName);
        localbb.field_encryptUsername = this.userName;
        localbb.field_conRemark = ((String)localObject);
        at.AR();
        com.tencent.mm.y.c.yL().a(localbb);
        at.AR();
        com.tencent.mm.y.c.yK().Q(paramString);
        this.mGp[2] = 1;
        if ((!bg.nm(this.aDn)) && (!((String)localObject).equals(this.aDn))) {
          this.mGp[5] = 1;
        }
        if (paramInt1 == 3)
        {
          paramString = ((com.tencent.mm.pluginsdk.model.n)paramk).tmZ;
          localObject = l.MK().lP(this.userName);
          at.AR();
          paramk = com.tencent.mm.y.c.yK().TE(this.userName);
          if ((paramString != null) && (paramString.contains(this.userName)))
          {
            paramString = paramk;
            if ((int)paramk.fTq != 0) {
              break label824;
            }
            paramk = com.tencent.mm.pluginsdk.ui.preference.b.b((f)localObject);
            at.AR();
            paramString = paramk;
            if (com.tencent.mm.y.c.yK().R(paramk)) {
              break label824;
            }
            w.e("MicroMsg.SayHiWithSnsPermissionUI", "canAddContact fail, insert fail");
          }
          label600:
          at.AR();
          paramString = com.tencent.mm.y.c.yK().TE(this.userName);
          paramk = new pu();
          paramk.eUx.eUz = true;
          paramk.eUx.eUy = false;
          paramk.eUx.username = this.userName;
          com.tencent.mm.sdk.b.a.vgX.m(paramk);
          if (!this.nOW.xrA) {
            break label862;
          }
          s.j(paramString);
        }
      }
      for (;;)
      {
        if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false))
        {
          paramString = new Intent();
          paramString.putExtra("friend_message_transfer_username", this.userName);
          paramString.setAction("friend_message_accept_" + this.userName);
          paramString.putExtra("MMActivity.OverrideEnterAnimation", R.a.aMb);
          paramString.putExtra("MMActivity.OverrideExitAnimation", R.a.aMa);
          d.b(this, "subapp", ".ui.friend.FMessageTransferUI", paramString);
        }
        setResult(-1, getIntent());
        finish();
        GMTrace.o(6811147042816L, 50747);
        return;
        label794:
        if (!bg.nm(this.aDn))
        {
          this.mGp[2] = 0;
          break;
        }
        this.mGp[2] = 2;
        break;
        label824:
        s.p(paramString);
        at.getNotification().ry();
        l.ML().J(this.userName, 1);
        com.tencent.mm.pluginsdk.ui.preference.b.aE(this.userName, this.nLz);
        break label600;
        label862:
        s.k(paramString);
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString)))
    {
      Toast.makeText(this, paramString, 1).show();
      GMTrace.o(6811147042816L, 50747);
      return;
    }
    for (;;)
    {
      if (!bg.nm(paramString))
      {
        com.tencent.mm.ui.base.h.a(this, paramString, getString(R.l.cUG), getString(R.l.cTM), null);
        GMTrace.o(6811147042816L, 50747);
        return;
      }
      do
      {
        do
        {
          Toast.makeText(this, R.l.dXF, 0).show();
          GMTrace.o(6811147042816L, 50747);
          return;
        } while (paramInt1 != 4);
        if (paramInt2 == -2) {
          break;
        }
      } while (paramInt2 != -101);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6810341736448L, 50741);
    int i = R.i.cEX;
    GMTrace.o(6810341736448L, 50741);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6810207518720L, 50740);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(6810207518720L, 50740);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6810744389632L, 50744);
    com.tencent.mm.plugin.report.service.g.ork.i(14036, new Object[] { Integer.valueOf(this.mGp[0]), Integer.valueOf(this.mGp[1]), Integer.valueOf(this.mGp[2]), Integer.valueOf(this.mGp[3]), Integer.valueOf(this.mGp[4]), Integer.valueOf(this.mGp[5]), Integer.valueOf(this.mGp[6]), Integer.valueOf(this.mGp[7]) });
    super.onDestroy();
    GMTrace.o(6810744389632L, 50744);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6811281260544L, 50748);
    if (paramInt == 4)
    {
      this.mGp[0] = 1;
      finish();
      GMTrace.o(6811281260544L, 50748);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6811281260544L, 50748);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(6810475954176L, 50742);
    if (this.nOZ)
    {
      at.AR();
      com.tencent.mm.y.c.yK().a(this.nPd);
      aXY();
    }
    at.wS().a(30, this);
    super.onResume();
    GMTrace.o(6810475954176L, 50742);
  }
  
  public void onStop()
  {
    GMTrace.i(6810610171904L, 50743);
    at.wS().b(30, this);
    if (this.nOZ)
    {
      at.AR();
      com.tencent.mm.y.c.yK().b(this.nPd);
    }
    super.onStop();
    GMTrace.o(6810610171904L, 50743);
  }
  
  private final class a
    extends ClickableSpan
  {
    public String hLO;
    
    public a(String paramString)
    {
      GMTrace.i(6762560225280L, 50385);
      this.hLO = paramString;
      GMTrace.o(6762560225280L, 50385);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(6762694443008L, 50386);
      SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).setText(com.tencent.mm.pluginsdk.ui.d.h.b(SayHiWithSnsPermissionUI.this, bg.nl(this.hLO), SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).getTextSize()));
      SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).setSelection(SayHiWithSnsPermissionUI.b(SayHiWithSnsPermissionUI.this).getText().length());
      SayHiWithSnsPermissionUI.l(SayHiWithSnsPermissionUI.this).setVisibility(8);
      SayHiWithSnsPermissionUI.k(SayHiWithSnsPermissionUI.this)[4] = 1;
      GMTrace.o(6762694443008L, 50386);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(6762828660736L, 50387);
      paramTextPaint.setColor(SayHiWithSnsPermissionUI.this.getResources().getColor(R.e.aMW));
      paramTextPaint.setUnderlineText(false);
      GMTrace.o(6762828660736L, 50387);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\SayHiWithSnsPermissionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */