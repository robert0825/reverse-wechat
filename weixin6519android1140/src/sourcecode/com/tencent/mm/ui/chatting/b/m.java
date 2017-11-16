package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.ui.chatting.da;
import com.tencent.mm.ui.chatting.dc;
import com.tencent.mm.ui.chatting.dc.a;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.ui.u;
import java.util.ArrayList;
import java.util.TreeSet;

public final class m
{
  public com.tencent.mm.ui.tools.p jQL;
  public View wIJ;
  public boolean wIK;
  public boolean wIL;
  public boolean wIM;
  public long wIN;
  public ArrayList<String> wIO;
  public boolean wIP;
  public TextView wIQ;
  public ListView wIR;
  public View wIS;
  public boolean wIT;
  private boolean wIU;
  private int wIV;
  public boolean wIW;
  public h wtd;
  public boolean wuY;
  public dc wzZ;
  
  public m(h paramh)
  {
    GMTrace.i(19218636472320L, 143190);
    this.jQL = null;
    this.wIK = false;
    this.wuY = false;
    this.wIL = false;
    this.wIM = false;
    this.wIN = -1L;
    this.wIP = false;
    this.wIT = false;
    this.wIU = true;
    this.wIV = 0;
    this.wIW = false;
    this.wtd = paramh;
    GMTrace.o(19218636472320L, 143190);
  }
  
  public final void CX(int paramInt)
  {
    GMTrace.i(19219039125504L, 143193);
    w.v("MicroMsg.ChattingUI.SearchImp", "search result count %d, in edit mode %B, can report %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.wIT), Boolean.valueOf(this.wIU) });
    if ((!this.wIK) && (!this.wIT))
    {
      w.d("MicroMsg.ChattingUI.SearchImp", "not search now");
      GMTrace.o(19219039125504L, 143193);
      return;
    }
    if ((this.wIU) && (paramInt >= 0))
    {
      this.wIU = false;
      g.ork.i(10811, new Object[] { Integer.valueOf(2) });
    }
    if (paramInt > 0)
    {
      this.wIR.setVisibility(0);
      this.wtd.cdm().setVisibility(8);
      this.wIQ.setVisibility(8);
      this.wIS.setVisibility(8);
      GMTrace.o(19219039125504L, 143193);
      return;
    }
    if (paramInt == 0)
    {
      this.wIR.setVisibility(8);
      this.wtd.cdm().setVisibility(8);
      this.wIQ.setVisibility(0);
      this.wIS.setVisibility(8);
      GMTrace.o(19219039125504L, 143193);
      return;
    }
    this.wIR.setVisibility(8);
    this.wtd.cdm().setVisibility(0);
    this.wIQ.setVisibility(8);
    this.wIS.setVisibility(0);
    GMTrace.o(19219039125504L, 143193);
  }
  
  public final void ceD()
  {
    GMTrace.i(19218770690048L, 143191);
    boolean bool;
    if (this.wIJ == null)
    {
      bool = true;
      w.v("MicroMsg.ChattingUI.SearchImp", "enter edit search mode, search stub view is null?%B", new Object[] { Boolean.valueOf(bool) });
      this.wIT = true;
      this.wtd.cdm().setVisibility(8);
      if (this.wIJ == null) {
        break label88;
      }
      this.wIJ.setVisibility(0);
    }
    for (;;)
    {
      CX(-1);
      GMTrace.o(19218770690048L, 143191);
      return;
      bool = false;
      break;
      label88:
      c.a(this.wtd.cdg(), R.h.caa);
      this.wIJ = this.wtd.cdg().findViewById(R.h.cal);
      this.wIJ.setVisibility(0);
      this.wIS = this.wtd.cdg().findViewById(R.h.bZY);
      this.wtd.cdm().setFocusable(false);
      this.wtd.cdm().setFocusableInTouchMode(false);
      this.wIS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19204812046336L, 143087);
          GMTrace.o(19204812046336L, 143087);
        }
      });
      this.wIS.setVisibility(8);
      this.wIQ = ((TextView)this.wtd.cdg().findViewById(R.h.bwH));
      this.wzZ = new dc(this.wtd.cdg().vKB.vKW, new au(), this.wtd.cci(), this.wtd.cdk(), this.wtd.ccT());
      this.wzZ.wAH = new dc.a()
      {
        public final void CL(int paramAnonymousInt)
        {
          GMTrace.i(19215952117760L, 143170);
          m.this.CX(paramAnonymousInt);
          GMTrace.o(19215952117760L, 143170);
        }
      };
      this.wIR = ((ListView)this.wtd.cdg().findViewById(R.h.bZZ));
      this.wIR.setVisibility(0);
      this.wIR.setAdapter(this.wzZ);
      this.wIR.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(19206691094528L, 143101);
          paramAnonymousAdapterView = (au)m.this.wzZ.getItem(paramAnonymousInt);
          if ((paramAnonymousAdapterView != null) && (!bg.nm(paramAnonymousAdapterView.field_talker)))
          {
            m.this.ceE();
            if (m.this.wtd.cdp() != null)
            {
              paramAnonymousView = m.this.wtd.cdp();
              if (paramAnonymousAdapterView != null) {
                break label240;
              }
              w.w("MicroMsg.ChattingMoreBtnBarHelper", "perform search mode click msg item fail, msg is null");
            }
          }
          for (;;)
          {
            if (!m.this.wIP)
            {
              m.this.wIP = true;
              m.this.wtd.cdo().lF(true);
              m.this.wtd.cdm().setTranscriptMode(0);
            }
            m.this.wtd.cdo().lD(false);
            m.this.wtd.cdo().lE(false);
            final int i = m.this.wtd.cdn().m(paramAnonymousAdapterView.field_msgId, false);
            m.this.wtd.cdn().a(null, null);
            m.this.wtd.cdm().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19210046537728L, 143126);
                w.i("MicroMsg.ChattingUI.SearchImp", "on search click, click position %d, set selection %d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(i) });
                l.a(m.this.wtd.cdm(), i, false);
                GMTrace.o(19210046537728L, 143126);
              }
            });
            GMTrace.o(19206691094528L, 143101);
            return;
            label240:
            if (paramAnonymousView.wuV.eX(paramAnonymousAdapterView.field_msgId))
            {
              i = paramAnonymousView.wuV.wzw.size();
              paramAnonymousView.wzY.CI(i);
              paramAnonymousView.wzY.setVisibility(0);
              paramAnonymousView.jQL.cit();
            }
          }
        }
      });
      this.wIR.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(19217294295040L, 143180);
          m.this.wtd.cdg().avJ();
          GMTrace.o(19217294295040L, 143180);
          return false;
        }
      });
      if (this.wtd.cdp() != null) {
        this.wtd.cdp().wzZ = this.wzZ;
      }
    }
  }
  
  public final void ceE()
  {
    GMTrace.i(19218904907776L, 143192);
    w.v("MicroMsg.ChattingUI.SearchImp", "exit edit search mode");
    this.wIT = false;
    this.wIU = true;
    if (this.wIQ != null) {
      this.wIQ.setVisibility(8);
    }
    if (this.wIS != null) {
      this.wIS.setVisibility(8);
    }
    if (this.wIR != null) {
      this.wIR.setVisibility(8);
    }
    this.wtd.cdm().setVisibility(0);
    this.wtd.cdg().avJ();
    GMTrace.o(19218904907776L, 143192);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */