package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.bk.d.a;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InviteRemindDialog
  extends MMBaseActivity
{
  private String eDs;
  private TextView ikm;
  private TextView qKU;
  private int type;
  
  public InviteRemindDialog()
  {
    GMTrace.i(5356495306752L, 39909);
    this.eDs = "";
    this.type = 0;
    GMTrace.o(5356495306752L, 39909);
  }
  
  public static void j(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(5356897959936L, 39912);
    Intent localIntent = new Intent(paramContext, InviteRemindDialog.class);
    localIntent.putExtra("InviteRemindDialog_User", paramString);
    localIntent.putExtra("InviteRemindDialog_Type", paramInt);
    paramContext.startActivity(localIntent);
    GMTrace.o(5356897959936L, 39912);
  }
  
  public void finish()
  {
    GMTrace.i(5356763742208L, 39911);
    super.finish();
    GMTrace.o(5356763742208L, 39911);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5356629524480L, 39910);
    super.onCreate(paramBundle);
    setContentView(R.i.cCo);
    this.ikm = ((TextView)findViewById(R.h.bNp));
    this.qKU = ((TextView)findViewById(R.h.bNm));
    this.eDs = getIntent().getStringExtra("InviteRemindDialog_User");
    this.type = getIntent().getIntExtra("InviteRemindDialog_Type", 0);
    if (this.type == 0)
    {
      this.ikm.setText(getString(R.l.eiV));
      this.qKU.setText(getString(R.l.eiG));
    }
    for (;;)
    {
      findViewById(R.h.bNq).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5364145717248L, 39966);
          d.a locala;
          if (InviteRemindDialog.a(InviteRemindDialog.this) != null) {
            try
            {
              at.AR();
              paramAnonymousView = d.a.Qa((String)com.tencent.mm.y.c.xh().get(77829, null));
              if (paramAnonymousView == null) {
                break label377;
              }
              if ((paramAnonymousView != null) && (paramAnonymousView.size() > 0))
              {
                if (!paramAnonymousView.containsKey(InviteRemindDialog.a(InviteRemindDialog.this))) {
                  break label341;
                }
                locala = (d.a)paramAnonymousView.get(InviteRemindDialog.a(InviteRemindDialog.this));
                locala.gPZ += 1;
                paramAnonymousView.put(InviteRemindDialog.a(InviteRemindDialog.this), locala);
              }
              at.AR();
              com.tencent.mm.y.c.xh().set(77829, d.a.ag(paramAnonymousView));
              paramAnonymousView = paramAnonymousView.entrySet().iterator();
              while (paramAnonymousView.hasNext())
              {
                locala = (d.a)((Map.Entry)paramAnonymousView.next()).getValue();
                w.d("MMInviteRemindDialog", "val " + locala.hitCount + " " + locala.gPZ);
              }
              if (InviteRemindDialog.b(InviteRemindDialog.this) != 0) {
                break label512;
              }
            }
            catch (Exception paramAnonymousView)
            {
              w.printErrStackTrace("MMInviteRemindDialog", paramAnonymousView, "", new Object[0]);
            }
          }
          label220:
          paramAnonymousView = InviteRemindDialog.this.getString(R.l.eiF);
          for (;;)
          {
            paramAnonymousView = new com.tencent.mm.plugin.voip.model.c(InviteRemindDialog.a(InviteRemindDialog.this), paramAnonymousView, s.go(InviteRemindDialog.a(InviteRemindDialog.this)));
            at.wS().a(paramAnonymousView, 0);
            paramAnonymousView = new Intent();
            paramAnonymousView.addFlags(536870912);
            paramAnonymousView.addFlags(67108864);
            paramAnonymousView.putExtra("Chat_User", InviteRemindDialog.a(InviteRemindDialog.this));
            a.hnH.e(paramAnonymousView, InviteRemindDialog.this);
            InviteRemindDialog.this.finish();
            GMTrace.o(5364145717248L, 39966);
            return;
            label341:
            locala = new d.a();
            locala.gPZ += 1;
            paramAnonymousView.put(InviteRemindDialog.a(InviteRemindDialog.this), locala);
            break;
            label377:
            paramAnonymousView = new HashMap();
            locala = new d.a();
            locala.gPZ += 1;
            paramAnonymousView.put(InviteRemindDialog.a(InviteRemindDialog.this), locala);
            at.AR();
            com.tencent.mm.y.c.xh().set(77829, d.a.ag(paramAnonymousView));
            paramAnonymousView = paramAnonymousView.entrySet().iterator();
            while (paramAnonymousView.hasNext())
            {
              locala = (d.a)((Map.Entry)paramAnonymousView.next()).getValue();
              w.d("MMInviteRemindDialog", "val " + locala.hitCount + " " + locala.gPZ);
            }
            break label220;
            label512:
            if (InviteRemindDialog.b(InviteRemindDialog.this) == 1) {
              paramAnonymousView = InviteRemindDialog.this.getString(R.l.ejj);
            } else {
              paramAnonymousView = null;
            }
          }
        }
      });
      findViewById(R.h.bNg).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5357434830848L, 39916);
          InviteRemindDialog.this.finish();
          GMTrace.o(5357434830848L, 39916);
        }
      });
      GMTrace.o(5356629524480L, 39910);
      return;
      if (this.type == 1)
      {
        this.ikm.setText(getString(R.l.ejo));
        this.qKU.setText(getString(R.l.ejk));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\InviteRemindDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */