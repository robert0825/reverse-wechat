package com.tencent.mm.plugin.chatroom.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;

public class RoomCardUI
  extends MMActivity
  implements e
{
  private com.tencent.mm.ui.base.r ihl;
  private c jNR;
  private String jOR;
  private e.b jOW;
  private String jPg;
  private int jPh;
  private String jPi;
  private boolean jPj;
  private String jPk;
  private String jPl;
  private long jPm;
  private TextView jPn;
  private MMEditText jPo;
  private TextView jPp;
  private TextView jPq;
  private ImageView jPr;
  private LinearLayout jPs;
  private LinearLayout jPt;
  private LinearLayout jPu;
  private LinearLayout jPv;
  private boolean jPw;
  
  public RoomCardUI()
  {
    GMTrace.i(9132174213120L, 68040);
    this.jNR = new c() {};
    this.jPw = false;
    GMTrace.o(9132174213120L, 68040);
  }
  
  private boolean anF()
  {
    GMTrace.i(9132979519488L, 68046);
    String str = this.jPo.getText().toString();
    if (bg.nm(str))
    {
      if (bg.nm(this.jPk))
      {
        GMTrace.o(9132979519488L, 68046);
        return false;
      }
      GMTrace.o(9132979519488L, 68046);
      return true;
    }
    if ((this.jPk == null) || (!this.jPk.equals(str)))
    {
      GMTrace.o(9132979519488L, 68046);
      return true;
    }
    GMTrace.o(9132979519488L, 68046);
    return false;
  }
  
  private void anG()
  {
    GMTrace.i(9133113737216L, 68047);
    if (anF())
    {
      lf(true);
      GMTrace.o(9133113737216L, 68047);
      return;
    }
    lf(false);
    GMTrace.o(9133113737216L, 68047);
  }
  
  private void anH()
  {
    GMTrace.i(9133650608128L, 68051);
    Intent localIntent = new Intent();
    localIntent.putExtra("room_name", this.jPg);
    localIntent.putExtra("room_notice", this.jPk);
    setResult(-1, localIntent);
    finish();
    GMTrace.o(9133650608128L, 68051);
  }
  
  private void goBack()
  {
    GMTrace.i(9132845301760L, 68045);
    if (!this.jPj)
    {
      setResult(0);
      finish();
      GMTrace.o(9132845301760L, 68045);
      return;
    }
    if (anF())
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dSt), null, getString(R.l.dSv), getString(R.l.dSu), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9089090322432L, 67719);
          GMTrace.o(9089090322432L, 67719);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9135663874048L, 68066);
          RoomCardUI.this.setResult(0);
          RoomCardUI.this.finish();
          GMTrace.o(9135663874048L, 68066);
        }
      });
      GMTrace.o(9132845301760L, 68045);
      return;
    }
    setResult(0);
    finish();
    GMTrace.o(9132845301760L, 68045);
  }
  
  protected final void MP()
  {
    GMTrace.i(9132442648576L, 68042);
    oM(R.l.dTu);
    a(0, getString(R.l.cSC), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9167473475584L, 68303);
        if (paramAnonymousMenuItem.getTitle().equals(RoomCardUI.this.getString(R.l.cTh))) {
          RoomCardUI.a(RoomCardUI.this);
        }
        RoomCardUI.b(RoomCardUI.this).setEnabled(true);
        RoomCardUI.b(RoomCardUI.this).setFocusableInTouchMode(true);
        RoomCardUI.b(RoomCardUI.this).setFocusable(true);
        RoomCardUI.b(RoomCardUI.this).setCursorVisible(true);
        RoomCardUI.this.aH(0, RoomCardUI.this.getString(R.l.cTh));
        RoomCardUI.this.lf(false);
        RoomCardUI.this.aLs();
        RoomCardUI.b(RoomCardUI.this).setSelection(RoomCardUI.b(RoomCardUI.this).getText().toString().length());
        GMTrace.o(9167473475584L, 68303);
        return true;
      }
    }, p.b.vLG);
    lf(true);
    this.jPu = ((LinearLayout)findViewById(R.h.bFX));
    this.jPv = ((LinearLayout)findViewById(R.h.bYX));
    this.jPo = ((MMEditText)findViewById(R.h.bRU));
    this.jPp = ((TextView)findViewById(R.h.bRX));
    this.jPq = ((TextView)findViewById(R.h.bRW));
    this.jPs = ((LinearLayout)findViewById(R.h.bZa));
    this.jPr = ((ImageView)findViewById(R.h.bRV));
    this.jPt = ((LinearLayout)findViewById(R.h.bZc));
    this.jPo.setText(this.jPk);
    Object localObject = (WindowManager)getSystemService("window");
    this.jPo.setMinHeight(((WindowManager)localObject).getDefaultDisplay().getHeight() * 2 / 3 - 100);
    com.tencent.mm.pluginsdk.ui.d.h.b(this.jPo, Integer.valueOf(31));
    this.jPn = ((TextView)findViewById(R.h.bJV));
    this.jPn.setText(Integer.toString(com.tencent.mm.ui.tools.h.aO(280, this.jPk)));
    this.jPt.setVisibility(8);
    this.jPo.setCursorVisible(false);
    this.jPo.setFocusable(false);
    label359:
    label475:
    String str;
    if (!this.jPj)
    {
      AZ(0);
      this.jPv.setVisibility(0);
      this.jPo.setFocusable(false);
      this.jPo.setCursorVisible(false);
      this.jPo.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(9081037258752L, 67659);
          RoomCardUI.a(RoomCardUI.this, RoomCardUI.b(RoomCardUI.this));
          GMTrace.o(9081037258752L, 67659);
          return true;
        }
      });
      if (this.jPm == 0L) {
        break label563;
      }
      this.jPp.setVisibility(0);
      this.jPp.setText(com.tencent.mm.pluginsdk.i.n.ac("yyyy-MM-dd HH:mm", this.jPm));
      if (!bg.nm(this.jPk)) {
        break label575;
      }
      this.jPo.setEnabled(true);
      this.jPo.setFocusableInTouchMode(true);
      this.jPo.setFocusable(true);
      this.jPu.setVisibility(8);
      this.jPo.setMinHeight(((WindowManager)localObject).getDefaultDisplay().getHeight() * 2 / 3 + 100);
      this.jPo.requestFocus();
      this.jPo.setCursorVisible(true);
      aH(0, this.vKB.vKW.getString(R.l.cTh));
      anG();
      this.jPo.performClick();
      aLs();
      localObject = com.tencent.mm.y.r.fs(this.jPl);
      this.jPq.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject, this.jPq.getTextSize()));
      localObject = this.jPr;
      str = this.jPl;
      if (!bg.nm(str)) {
        break label586;
      }
      ((ImageView)localObject).setImageResource(R.g.aVS);
    }
    for (;;)
    {
      this.jPo.addTextChangedListener(new a());
      GMTrace.o(9132442648576L, 68042);
      return;
      this.jPv.setVisibility(8);
      break;
      label563:
      this.jPp.setVisibility(8);
      break label359;
      label575:
      this.jPu.setVisibility(0);
      break label475;
      label586:
      a.b.a((ImageView)localObject, str);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9133516390400L, 68050);
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    if (paramk.getType() == 993)
    {
      if ((this.ihl != null) && (this.ihl.isShowing())) {
        this.ihl.dismiss();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.RoomInfoUI", "dz[onSceneEnd : set announcement successfully!]");
        this.jPk = this.jPo.getText().toString();
        g.ork.a(219L, 15L, 1L, true);
        anH();
        GMTrace.o(9133516390400L, 68050);
        return;
      }
      w.w("MicroMsg.RoomInfoUI", "dz[handleSetNoticeFailed:%s]", new Object[] { paramString });
      u.makeText(this, R.l.dTD, 1).show();
      w.i("MicroMsg.RoomInfoUI", "dz[onSceneEnd : set announcement failed:%d %d %s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      GMTrace.o(9133516390400L, 68050);
      return;
    }
    w.w("MicroMsg.RoomInfoUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paramk.getType()) });
    GMTrace.o(9133516390400L, 68050);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9132308430848L, 68041);
    int i = R.i.cES;
    GMTrace.o(9132308430848L, 68041);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9133382172672L, 68049);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(9133382172672L, 68049);
      return;
    }
    if (paramInt1 == 1)
    {
      this.jPj = false;
      if (!this.jPj)
      {
        this.jPt.setVisibility(8);
        this.jPo.setFocusableInTouchMode(false);
        this.jPo.setFocusable(false);
        this.jPt.setVisibility(8);
      }
    }
    GMTrace.o(9133382172672L, 68049);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9132576866304L, 68043);
    super.onCreate(paramBundle);
    g.ork.a(219L, 0L, 1L, true);
    at.wS().a(993, this);
    this.jOR = getIntent().getStringExtra("RoomInfo_Id");
    this.jPk = getIntent().getStringExtra("room_notice");
    this.jPl = getIntent().getStringExtra("room_notice_editor");
    this.jPm = getIntent().getLongExtra("room_notice_publish_time", 0L);
    this.jPg = getIntent().getStringExtra("room_name");
    this.jPh = getIntent().getIntExtra("room_member_count", 0);
    this.jPi = getIntent().getStringExtra("room_owner_name");
    this.jPj = getIntent().getBooleanExtra("Is_RoomOwner", false);
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9080768823296L, 67657);
        RoomCardUI.c(RoomCardUI.this);
        GMTrace.o(9080768823296L, 67657);
        return true;
      }
    });
    GMTrace.o(9132576866304L, 68043);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9132711084032L, 68044);
    super.onDestroy();
    at.wS().b(993, this);
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    GMTrace.o(9132711084032L, 68044);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9133247954944L, 68048);
    super.onKeyDown(paramInt, paramKeyEvent);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      goBack();
      GMTrace.o(9133247954944L, 68048);
      return true;
    }
    GMTrace.o(9133247954944L, 68048);
    return false;
  }
  
  private final class a
    implements TextWatcher
  {
    private String jPA;
    private boolean jPB;
    private int jPz;
    
    public a()
    {
      GMTrace.i(9117678698496L, 67932);
      this.jPz = 280;
      this.jPA = "";
      this.jPB = false;
      GMTrace.o(9117678698496L, 67932);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(9118081351680L, 67935);
      GMTrace.o(9118081351680L, 67935);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(9117812916224L, 67933);
      GMTrace.o(9117812916224L, 67933);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(9117947133952L, 67934);
      RoomCardUI.d(RoomCardUI.this);
      GMTrace.o(9117947133952L, 67934);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */