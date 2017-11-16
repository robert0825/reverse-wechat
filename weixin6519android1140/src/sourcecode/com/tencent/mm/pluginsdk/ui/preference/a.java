package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.g;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.j;
import com.tencent.mm.bc.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.y.at;

public final class a
  extends LinearLayout
  implements com.tencent.mm.ad.e
{
  static a tCu;
  private Context context;
  r hsU;
  private TextView hvO;
  private Button tCv;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1042200657920L, 7765);
    this.context = paramContext;
    paramContext = View.inflate(this.context, R.i.cxq, this);
    this.hvO = ((TextView)paramContext.findViewById(R.h.bAJ));
    this.tCv = ((Button)paramContext.findViewById(R.h.bAK));
    this.tCv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1041529569280L, 7760);
        paramAnonymousView = View.inflate(a.a(a.this), R.i.cFS, null);
        ((TextView)paramAnonymousView.findViewById(R.h.ccl)).setVisibility(8);
        final TextView localTextView = (TextView)paramAnonymousView.findViewById(R.h.coE);
        localTextView.setVisibility(0);
        localTextView.setText("50");
        final EditText localEditText = (EditText)paramAnonymousView.findViewById(R.h.cck);
        localEditText.setSingleLine(false);
        c.d(localEditText).Ea(100).a(null);
        localEditText.addTextChangedListener(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymous2Editable)
          {
            GMTrace.i(1042066440192L, 7764);
            int i = com.tencent.mm.ui.tools.h.aO(100, paramAnonymous2Editable.toString());
            if (localTextView != null) {
              localTextView.setText(String.valueOf(i));
            }
            GMTrace.o(1042066440192L, 7764);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymous2CharSequence, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
          {
            GMTrace.i(1041932222464L, 7763);
            GMTrace.o(1041932222464L, 7763);
          }
          
          public final void onTextChanged(CharSequence paramAnonymous2CharSequence, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
          {
            GMTrace.i(1041798004736L, 7762);
            GMTrace.o(1041798004736L, 7762);
          }
        });
        com.tencent.mm.ui.base.h.a(a.a(a.this), a.a(a.this).getString(R.l.cUm), paramAnonymousView, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(1048374673408L, 7811);
            paramAnonymous2DialogInterface = localEditText.getText().toString().trim();
            if ((paramAnonymous2DialogInterface != null) && (paramAnonymous2DialogInterface.length() > 0)) {
              a.a(a.this, paramAnonymous2DialogInterface);
            }
            GMTrace.o(1048374673408L, 7811);
          }
        }, null);
        localEditText.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1056964608000L, 7875);
            if ((a.a(a.this) instanceof MMActivity)) {
              ((MMActivity)a.a(a.this)).aLs();
            }
            GMTrace.o(1056964608000L, 7875);
          }
        });
        GMTrace.o(1041529569280L, 7760);
      }
    });
    GMTrace.o(1042200657920L, 7765);
  }
  
  private static int Pw(String paramString)
  {
    GMTrace.i(1042334875648L, 7766);
    if (paramString == null)
    {
      w.d("MicroMsg.FMessageItemView", "getOpCodeFromVerify fail, xml is null");
      GMTrace.o(1042334875648L, 7766);
      return 6;
    }
    switch (au.d.Uk(paramString).eHJ)
    {
    case 3: 
    case 4: 
    default: 
      GMTrace.o(1042334875648L, 7766);
      return 6;
    case 2: 
    case 5: 
      GMTrace.o(1042334875648L, 7766);
      return 6;
    }
    GMTrace.o(1042334875648L, 7766);
    return 5;
  }
  
  public final void Px(String paramString)
  {
    GMTrace.i(1042469093376L, 7767);
    this.hvO.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, bg.nl(paramString), this.hvO.getTextSize()));
    GMTrace.o(1042469093376L, 7767);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(1042737528832L, 7769);
    if (paramk.getType() != 30)
    {
      GMTrace.o(1042737528832L, 7769);
      return;
    }
    w.d("MicroMsg.FMessageItemView", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramInt1 = ((com.tencent.mm.pluginsdk.model.n)paramk).eHJ;
      paramString = ((com.tencent.mm.pluginsdk.model.n)paramk).tna;
      w.d("MicroMsg.FMessageItemView", "onSceneEnd, pre insert fmsg, opcode = " + paramInt1 + ", verifyContent = " + paramString);
      w.d("MicroMsg.FMessageItemView", "onSceneEnd, type = " + tCu.type);
      switch (tCu.type)
      {
      default: 
        paramk = new f();
        paramk.field_createTime = com.tencent.mm.bc.e.k(tCu.eDs, 0L);
        paramk.field_isSend = 1;
        paramk.field_msgContent = paramString;
        paramk.field_talker = tCu.eDs;
        if (paramInt1 != 5) {
          break;
        }
      }
      for (paramInt1 = 2;; paramInt1 = 3)
      {
        paramk.field_type = paramInt1;
        boolean bool = l.MK().a(paramk);
        w.d("MicroMsg.FMessageItemView", "onSceneEnd, insert fmsg, ret = " + bool);
        for (;;)
        {
          at.wS().b(30, this);
          GMTrace.o(1042737528832L, 7769);
          return;
          paramk = new com.tencent.mm.bc.h();
          paramk.field_createtime = i.lV(tCu.eDs);
          paramk.field_isSend = 1;
          paramk.field_content = paramString;
          paramk.field_talker = "fmessage";
          paramk.field_sayhiuser = tCu.eDs;
          paramk.field_svrid = System.currentTimeMillis();
          paramk.field_status = 4;
          l.MM().a(paramk);
          continue;
          paramk = new j();
          paramk.field_createtime = com.tencent.mm.bc.k.lV(tCu.eDs);
          paramk.field_isSend = 1;
          paramk.field_content = paramString;
          paramk.field_talker = "fmessage";
          paramk.field_sayhiuser = tCu.eDs;
          paramk.field_svrid = System.currentTimeMillis();
          paramk.field_status = 4;
          bool = l.MN().a(paramk);
          w.d("MicroMsg.FMessageItemView", "onSceneEnd, insert shake, ret = " + bool);
        }
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -34)) {
      paramk = this.context.getString(R.l.dwo);
    }
    for (;;)
    {
      Toast.makeText(this.context, paramk, 1).show();
      break;
      if ((paramInt1 == 4) && (paramInt2 == -94))
      {
        paramk = this.context.getString(R.l.dwp);
      }
      else if ((paramInt1 == 4) && (paramInt2 == -24))
      {
        paramk = paramString;
        if (!bg.nm(paramString)) {}
      }
      else
      {
        paramk = this.context.getString(R.l.dXF);
      }
    }
  }
  
  public final void zE(int paramInt)
  {
    GMTrace.i(1042603311104L, 7768);
    if (this.tCv != null) {
      this.tCv.setVisibility(paramInt);
    }
    GMTrace.o(1042603311104L, 7768);
  }
  
  public static final class a
  {
    public String eDs;
    public String nLA;
    public int scene;
    public int type;
    
    public a()
    {
      GMTrace.i(1046764060672L, 7799);
      GMTrace.o(1046764060672L, 7799);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */