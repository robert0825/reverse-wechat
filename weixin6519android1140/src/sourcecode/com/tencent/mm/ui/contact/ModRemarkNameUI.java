package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.tools.h.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.widget.MMEditText.b;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class ModRemarkNameUI
  extends MMActivity
  implements e
{
  private String eQu;
  private String hLO;
  private x iBi;
  private ArrayList<String> nLJ;
  private int nLz;
  private String nMq;
  private MMTagPanel nPb;
  private bb oaA;
  private TextView wRB;
  private TextView wRq;
  private View wRr;
  private View wRs;
  private View wRt;
  private a wTA;
  private View wTB;
  private EditText wTs;
  private int wTt;
  private String wTu;
  private TextView wTv;
  private EditText wTw;
  private TextView wTx;
  private String wTy;
  private boolean wTz;
  
  public ModRemarkNameUI()
  {
    GMTrace.i(1758118019072L, 13099);
    this.wTu = "";
    this.hLO = "";
    this.wTv = null;
    this.wTw = null;
    this.wTx = null;
    this.wTy = "";
    this.wTz = false;
    this.nLz = 9;
    this.wTA = new a();
    GMTrace.o(1758118019072L, 13099);
  }
  
  protected final void MP()
  {
    GMTrace.i(1758520672256L, 13102);
    this.eQu = getIntent().getStringExtra("Contact_User");
    if ((this.eQu != null) && (this.eQu.length() > 0))
    {
      at.AR();
      this.iBi = com.tencent.mm.y.c.yK().TE(this.eQu);
      at.AR();
      this.oaA = com.tencent.mm.y.c.yL().CC(this.eQu);
      if ((this.iBi == null) || (t.nm(this.iBi.field_username)))
      {
        this.iBi = new x(this.eQu);
        this.iBi.cl(t.nl(this.wTu));
        this.iBi.cj(t.nl(this.hLO));
      }
    }
    this.wTs = ((EditText)findViewById(R.h.bqM));
    final Object localObject = new MMEditText.b()
    {
      public final void bcg()
      {
        GMTrace.i(1789524967424L, 13333);
        if (ModRemarkNameUI.a(ModRemarkNameUI.this).getText().toString().trim().length() > 0) {
          ModRemarkNameUI.this.lf(true);
        }
        GMTrace.o(1789524967424L, 13333);
      }
    };
    h.a locala = new h.a();
    locala.tHa = ((MMEditText.b)localObject);
    this.wTs.addTextChangedListener(locala);
    com.tencent.mm.ui.tools.a.c.d(this.wTs).Ea(100).a(null);
    if ((this.iBi != null) && (this.wTt != 3))
    {
      if (this.wTt == 4)
      {
        this.wTs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.wTu), this.wTs.getTextSize()));
        this.wTs.setSelection(this.wTs.getText().length());
      }
    }
    else
    {
      if (this.wTt != 0) {
        break label981;
      }
      oM(R.l.djY);
      localObject = com.tencent.mm.modelfriend.af.If().jJ(this.iBi.field_username);
      if ((localObject != null) && (!t.nm(((com.tencent.mm.modelfriend.b)localObject).GU())) && (!((com.tencent.mm.modelfriend.b)localObject).GU().equals(this.wTs.getText()))) {
        break label893;
      }
      label329:
      a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1737314271232L, 12944);
          switch (ModRemarkNameUI.b(ModRemarkNameUI.this))
          {
          }
          for (;;)
          {
            GMTrace.o(1737314271232L, 12944);
            return true;
            ModRemarkNameUI.c(ModRemarkNameUI.this);
            continue;
            ModRemarkNameUI.d(ModRemarkNameUI.this);
            continue;
            ModRemarkNameUI.e(ModRemarkNameUI.this);
          }
        }
      });
      if ((this.wTs == null) || (this.wTs.getText().toString().trim().length() <= 0)) {
        break label1114;
      }
      lf(true);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1749662302208L, 13036);
          ModRemarkNameUI.this.finish();
          GMTrace.o(1749662302208L, 13036);
          return true;
        }
      });
      this.wTv = ((TextView)findViewById(R.h.bqT));
      this.wTw = ((EditText)findViewById(R.h.bqL));
      this.wTx = ((TextView)findViewById(R.h.coE));
      this.wRt = findViewById(R.h.bqK);
      com.tencent.mm.ui.tools.a.c.d(this.wTw).Ea(800).a(null);
      this.wTx.setText(com.tencent.mm.ui.tools.h.aO(800, this.wTw.getEditableText().toString()));
      this.wTw.append(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.wTy), this.wTw.getTextSize()));
      this.wTv.append(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.wTy), this.wTv.getTextSize()));
      if (this.oaA != null)
      {
        this.wTw.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.oaA.field_conDescription), this.wTw.getTextSize()));
        this.wTv.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.oaA.field_conDescription), this.wTw.getTextSize()));
      }
      this.wTw.addTextChangedListener(new b());
      this.wTv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1761339244544L, 13123);
          ModRemarkNameUI.f(ModRemarkNameUI.this).setVisibility(0);
          ModRemarkNameUI.g(ModRemarkNameUI.this).setVisibility(8);
          ModRemarkNameUI.h(ModRemarkNameUI.this).requestFocus();
          ModRemarkNameUI.this.aLs();
          GMTrace.o(1761339244544L, 13123);
        }
      });
      GMTrace.o(1758520672256L, 13102);
      return;
      if (!t.nm(this.iBi.field_conRemark))
      {
        this.wTs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.iBi.field_conRemark), this.wTs.getTextSize()));
        break;
      }
      if (!t.nm(this.hLO))
      {
        this.wTs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.hLO), this.wTs.getTextSize()));
        break;
      }
      if (!t.nm(this.iBi.field_nickname))
      {
        this.wTs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.iBi.field_nickname), this.wTs.getTextSize()));
        break;
      }
      if (!t.nm(this.wTu))
      {
        this.wTs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.wTu), this.wTs.getTextSize()));
        break;
      }
      localObject = this.iBi.field_nickname;
      if ((t.nm((String)localObject)) || (((String)localObject).length() > 50)) {}
      for (int i = 0;; i = 1)
      {
        if (i == 0) {
          break label881;
        }
        this.wTs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.iBi.vk()), this.wTs.getTextSize()));
        break;
      }
      label881:
      this.wTs.setText("");
      break;
      label893:
      this.wRq = ((TextView)findViewById(R.h.bOe));
      this.wRr = findViewById(R.h.bNZ);
      this.wRs = findViewById(R.h.bOf);
      this.wRr.setVisibility(0);
      this.wRq.setText(getString(R.l.dkL, new Object[] { ((com.tencent.mm.modelfriend.b)localObject).GU() }));
      this.wRs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1811536674816L, 13497);
          ModRemarkNameUI.a(ModRemarkNameUI.this).setText(localObject.GU());
          ModRemarkNameUI.a(ModRemarkNameUI.this).setSelection(ModRemarkNameUI.a(ModRemarkNameUI.this).getText().length());
          ModRemarkNameUI.i(ModRemarkNameUI.this).setVisibility(8);
          GMTrace.o(1811536674816L, 13497);
        }
      });
      break label329;
      label981:
      if (this.wTt == 3)
      {
        oM(R.l.edJ);
        this.wTs.setHint("");
        if (!t.nm(this.wTu)) {
          this.wTs.setText(this.wTu);
        }
        localObject = (TextView)findViewById(R.h.bqN);
        ((TextView)localObject).setText(R.l.dXL);
        ((TextView)localObject).setVisibility(0);
        findViewById(R.h.bOa).setVisibility(8);
        break label329;
      }
      if (this.wTt != 4) {
        break label329;
      }
      oM(R.l.dTr);
      this.wTs.setHint("");
      localObject = (TextView)findViewById(R.h.bqN);
      ((TextView)localObject).setText(R.l.dTK);
      ((TextView)localObject).setVisibility(0);
      break label329;
      label1114:
      lf(false);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1758923325440L, 13105);
    w.i("MiroMsg.ModRemarkName", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() == 44)
    {
      if ((paramInt1 != 0) && (paramInt2 < 0))
      {
        w.d("MiroMsg.ModRemarkName", "addRoomCard Error!");
        Toast.makeText(this, getString(R.l.dTE, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      finish();
    }
    GMTrace.o(1758923325440L, 13105);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1758386454528L, 13101);
    int i = R.i.cCw;
    GMTrace.o(1758386454528L, 13101);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1758252236800L, 13100);
    super.onCreate(paramBundle);
    this.nLz = getIntent().getIntExtra("Contact_Scene", 9);
    this.wTt = getIntent().getIntExtra("Contact_mode_name_type", 0);
    this.wTu = t.nl(getIntent().getStringExtra("Contact_Nick"));
    this.hLO = t.nl(getIntent().getStringExtra("Contact_RemarkName"));
    this.wTz = getIntent().getBooleanExtra("Contact_ModStrangerRemark", true);
    MP();
    this.wTB = findViewById(R.h.bqI);
    if (this.wTt != 0) {
      this.wTB.setVisibility(8);
    }
    for (;;)
    {
      this.nPb = ((MMTagPanel)findViewById(R.h.bqJ));
      this.nPb.lNJ = false;
      this.wRB = ((TextView)findViewById(R.h.bqH));
      this.wRB.setText(R.l.dIY);
      this.nPb.setOnClickListener(this.wTA);
      this.wRB.setOnClickListener(this.wTA);
      GMTrace.o(1758252236800L, 13100);
      return;
      this.wTB.setVisibility(0);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(1758789107712L, 13104);
    super.onDestroy();
    GMTrace.o(1758789107712L, 13104);
  }
  
  protected void onResume()
  {
    GMTrace.i(1758654889984L, 13103);
    super.onResume();
    at.AR();
    this.oaA = com.tencent.mm.y.c.yL().CC(this.eQu);
    if (this.oaA != null)
    {
      this.nMq = this.oaA.field_contactLabels;
      this.nLJ = ((ArrayList)a.aJP().AW(this.nMq));
    }
    if (!t.nm(this.nMq))
    {
      this.nPb.setVisibility(0);
      this.wRB.setVisibility(8);
      if ((this.nLJ != null) && (!this.nLJ.isEmpty()))
      {
        this.nPb.a(this.nLJ, this.nLJ);
        GMTrace.o(1758654889984L, 13103);
      }
    }
    else
    {
      this.nPb.setVisibility(8);
      this.wRB.setVisibility(0);
    }
    GMTrace.o(1758654889984L, 13103);
  }
  
  private final class a
    implements View.OnClickListener
  {
    public a()
    {
      GMTrace.i(1755970535424L, 13083);
      GMTrace.o(1755970535424L, 13083);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(1756104753152L, 13084);
      ModRemarkNameUI.l(ModRemarkNameUI.this);
      GMTrace.o(1756104753152L, 13084);
    }
  }
  
  private final class b
    implements TextWatcher
  {
    private int oGE;
    
    public b()
    {
      GMTrace.i(1836769607680L, 13685);
      this.oGE = 800;
      GMTrace.o(1836769607680L, 13685);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(1837172260864L, 13688);
      this.oGE = com.tencent.mm.ui.tools.h.aO(800, paramEditable.toString());
      if (this.oGE < 0) {
        this.oGE = 0;
      }
      if (ModRemarkNameUI.j(ModRemarkNameUI.this) != null) {
        ModRemarkNameUI.j(ModRemarkNameUI.this).setText(this.oGE);
      }
      ModRemarkNameUI.k(ModRemarkNameUI.this);
      GMTrace.o(1837172260864L, 13688);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1836903825408L, 13686);
      GMTrace.o(1836903825408L, 13686);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1837038043136L, 13687);
      GMTrace.o(1837038043136L, 13687);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\ModRemarkNameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */