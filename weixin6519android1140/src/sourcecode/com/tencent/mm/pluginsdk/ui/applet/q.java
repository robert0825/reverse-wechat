package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import java.util.LinkedList;
import junit.framework.Assert;

public final class q
  implements e
{
  public Context context;
  r hsU;
  public EditText nUE;
  LinkedList<Integer> nZt;
  public i oaD;
  public View oaE;
  public TextView oaF;
  String twp;
  public a txS;
  LinkedList<String> txT;
  boolean txU;
  
  public q(Context paramContext, a parama)
  {
    GMTrace.i(960327843840L, 7155);
    this.oaD = null;
    this.txU = true;
    this.context = paramContext;
    this.txS = parama;
    GMTrace.o(960327843840L, 7155);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(960864714752L, 7159);
    if (paramk.getType() != 30)
    {
      w.w("MicroMsg.SendVerifyRequest", "not expected scene,  type = " + paramk.getType());
      GMTrace.o(960864714752L, 7159);
      return;
    }
    w.d("MicroMsg.SendVerifyRequest", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    onStop();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.txU) {
        com.tencent.mm.ui.base.h.bm(this.context, this.context.getString(a.h.dXG));
      }
      this.txS.dG(true);
      GMTrace.o(960864714752L, 7159);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -34)) {
      paramk = this.context.getString(a.h.dwo);
    }
    for (;;)
    {
      if (this.txU) {
        Toast.makeText(this.context, paramk, 1).show();
      }
      this.txS.dG(false);
      GMTrace.o(960864714752L, 7159);
      return;
      if ((paramInt1 == 4) && (paramInt2 == -94))
      {
        paramk = this.context.getString(a.h.dwp);
      }
      else if ((paramInt1 == 4) && (paramInt2 == -24))
      {
        paramk = paramString;
        if (!bg.nm(paramString)) {}
      }
      else if (paramInt1 == 4)
      {
        paramk = paramString;
        if (!bg.nm(paramString)) {}
      }
      else
      {
        paramk = this.context.getString(a.h.dXF);
      }
    }
  }
  
  public final void g(LinkedList<String> paramLinkedList, LinkedList<Integer> paramLinkedList1)
  {
    GMTrace.i(960730497024L, 7158);
    boolean bool;
    if (paramLinkedList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramLinkedList1.size() <= 0) {
        break label322;
      }
      bool = true;
      label34:
      Assert.assertTrue(bool);
      onStart();
      this.txT = paramLinkedList;
      this.nZt = paramLinkedList1;
      this.oaE = View.inflate(this.context, a.f.cFS, null);
      if (this.twp != null) {
        break label328;
      }
      bool = true;
      label78:
      if (this.twp != null) {
        break label334;
      }
    }
    label322:
    label328:
    label334:
    for (int i = 0;; i = this.twp.length())
    {
      w.i("MicroMsg.SendVerifyRequest", "verifyTip is null: %b, length : %d, value : [%s]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), this.twp });
      if (!bg.nm(this.twp)) {
        ((TextView)this.oaE.findViewById(a.e.ccl)).setText(this.twp);
      }
      this.nUE = ((EditText)this.oaE.findViewById(a.e.cck));
      this.oaF = ((TextView)this.oaE.findViewById(a.e.coE));
      this.oaF.setVisibility(0);
      this.nUE.setText(null);
      this.oaF.setText("50");
      this.nUE.setFilters(com.tencent.mm.pluginsdk.ui.tools.h.tGZ);
      this.nUE.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(958985666560L, 7145);
          int j = 50 - paramAnonymousEditable.length();
          int i = j;
          if (j < 0) {
            i = 0;
          }
          if (q.this.oaF != null) {
            q.this.oaF.setText(String.valueOf(i));
          }
          GMTrace.o(958985666560L, 7145);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(958851448832L, 7144);
          GMTrace.o(958851448832L, 7144);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(958717231104L, 7143);
          GMTrace.o(958717231104L, 7143);
        }
      });
      paramLinkedList = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(942879539200L, 7025);
          if (q.this.oaD != null)
          {
            q.this.oaD.dismiss();
            q.this.oaD = null;
          }
          new aj(new aj.a()
          {
            public final boolean pM()
            {
              GMTrace.i(943147974656L, 7027);
              if (q.this.oaE != null)
              {
                q localq = q.this;
                String str = q.this.nUE.getText().toString().trim();
                Context localContext = localq.context;
                localq.context.getString(a.h.cUG);
                localq.hsU = com.tencent.mm.ui.base.h.a(localContext, localq.context.getString(a.h.dXH), true, new q.5(localq));
                com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.pluginsdk.model.n(2, localq.txT, localq.nZt, str, ""), 0);
              }
              GMTrace.o(943147974656L, 7027);
              return false;
            }
          }, false).z(500L, 500L);
          GMTrace.o(942879539200L, 7025);
        }
      };
      paramLinkedList1 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(961133150208L, 7161);
          if (q.this.oaD != null)
          {
            q.this.oaD.dismiss();
            q.this.oaD = null;
          }
          q.this.onStop();
          if (q.this.txS != null) {
            q.this.txS.dG(false);
          }
          GMTrace.o(961133150208L, 7161);
        }
      };
      this.oaD = com.tencent.mm.ui.base.h.a(this.context, this.context.getString(a.h.dXI), this.oaE, paramLinkedList, paramLinkedList1);
      if (this.oaD == null) {
        onStop();
      }
      this.nUE.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(938718789632L, 6994);
          if ((q.this.context instanceof MMActivity)) {
            ((MMActivity)q.this.context).aLs();
          }
          GMTrace.o(938718789632L, 6994);
        }
      });
      GMTrace.o(960730497024L, 7158);
      return;
      bool = false;
      break;
      bool = false;
      break label34;
      bool = false;
      break label78;
    }
  }
  
  final void onStart()
  {
    GMTrace.i(960462061568L, 7156);
    com.tencent.mm.kernel.h.xx().fYr.a(30, this);
    GMTrace.o(960462061568L, 7156);
  }
  
  public final void onStop()
  {
    GMTrace.i(960596279296L, 7157);
    com.tencent.mm.kernel.h.xx().fYr.b(30, this);
    if (this.oaD != null)
    {
      this.oaD.dismiss();
      this.oaD = null;
    }
    GMTrace.o(960596279296L, 7157);
  }
  
  public static abstract interface a
  {
    public abstract void dG(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */