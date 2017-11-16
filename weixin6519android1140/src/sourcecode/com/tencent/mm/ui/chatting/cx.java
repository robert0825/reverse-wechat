package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.ui.widget.MMTextView.b;
import com.tencent.mm.ui.widget.celltextview.CellTextView;

final class cx
  implements MMTextView.b
{
  public ae handler;
  public q hwd;
  private ScrollView kFq;
  private long oby;
  public boolean qvk;
  public boolean qvl;
  public int rIm;
  private View.OnTouchListener vPc;
  private En_5b8fbb1e.a wvE;
  private MMTextView wzP;
  private TextView wzQ;
  private final int wzR;
  private int wzS;
  public int wzT;
  
  public cx(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2187480530944L, 16298);
    this.wvE = null;
    this.hwd = null;
    this.wzP = null;
    this.wzQ = null;
    this.kFq = null;
    this.oby = 0L;
    this.wzR = 3;
    this.wzS = 0;
    this.rIm = 0;
    this.wzT = 0;
    this.qvk = false;
    this.qvl = false;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2154731405312L, 16054);
        paramAnonymousMessage = (View)paramAnonymousMessage.obj;
        if (cx.this.rIm != paramAnonymousMessage.getScrollY())
        {
          cx.this.qvk = true;
          cx.this.handler.sendMessageDelayed(cx.this.handler.obtainMessage(0, paramAnonymousMessage), 5L);
          cx.this.rIm = paramAnonymousMessage.getScrollY();
          GMTrace.o(2154731405312L, 16054);
          return;
        }
        cx.this.qvk = false;
        GMTrace.o(2154731405312L, 16054);
      }
    };
    this.vPc = null;
    this.wvE = parama;
    GMTrace.o(2187480530944L, 16298);
  }
  
  public final boolean dv(View paramView)
  {
    GMTrace.i(16267457069056L, 121202);
    if ((paramView.getTag() instanceof dr))
    {
      Object localObject = (dr)paramView.getTag();
      if ((((dr)localObject).jHw == 0) && (((paramView instanceof TextView)) || ((paramView instanceof CellTextView))) && (((dr)localObject).eRz != null) && (this.wvE != null))
      {
        localObject = "";
        if ((paramView instanceof TextView)) {
          localObject = ((TextView)paramView).getText();
        }
        for (;;)
        {
          paramView = this.wvE.vKB.vKW;
          Intent localIntent = new Intent(paramView, TextPreviewUI.class);
          localIntent.putExtra("key_chat_text", (CharSequence)localObject);
          paramView.startActivity(localIntent);
          b.fl(paramView);
          GMTrace.o(16267457069056L, 121202);
          return true;
          if ((paramView instanceof CellTextView)) {
            localObject = ((CellTextView)paramView).cjx();
          }
        }
      }
    }
    GMTrace.o(16267457069056L, 121202);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */