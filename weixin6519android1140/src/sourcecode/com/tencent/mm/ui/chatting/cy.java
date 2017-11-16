package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;

class cy
  implements View.OnLongClickListener
{
  public int juH;
  public int juI;
  private View.OnCreateContextMenuListener odu;
  public View wrx;
  public En_5b8fbb1e.a wvE;
  
  public cy(View.OnCreateContextMenuListener paramOnCreateContextMenuListener, En_5b8fbb1e.a parama)
  {
    GMTrace.i(2308813357056L, 17202);
    this.wvE = parama;
    this.odu = paramOnCreateContextMenuListener;
    GMTrace.o(2308813357056L, 17202);
  }
  
  public boolean onLongClick(View paramView)
  {
    GMTrace.i(2308947574784L, 17203);
    Object localObject1;
    if ((paramView.getTag() instanceof dr))
    {
      dr localdr = (dr)paramView.getTag();
      int i = this.wvE.mTr.mQN.getSelectionStart();
      if (localdr.jHw == 1)
      {
        if (!this.wvE.wDp)
        {
          w.w("MicroMsg.ChattingListLongClickListener", "ChattingUI disable Touch NOW!!!");
          GMTrace.o(2308947574784L, 17203);
          return true;
        }
        if (localdr.userName.equals(com.tencent.mm.y.q.zE()))
        {
          GMTrace.o(2308947574784L, 17203);
          return true;
        }
        if (this.wvE.mTr.tvi)
        {
          w.i("MicroMsg.ChattingListLongClickListener", "ChatFooter VoiceInputPanel Show NOW!!!");
          GMTrace.o(2308947574784L, 17203);
          return true;
        }
        Object localObject2;
        if ((s.eb(this.wvE.cci())) || (this.wvE.wDj))
        {
          g.ork.i(10976, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
          at.AR();
          localObject1 = c.yT().gC(localdr.chatroomName);
          if (this.wvE.wDj)
          {
            localObject1 = this.wvE.fs(localdr.userName);
            localObject2 = new StringBuffer(this.wvE.mTr.bMe());
            ((StringBuffer)localObject2).insert(i, "@" + (String)localObject1 + ' ');
            this.wvE.mTr.p(((StringBuffer)localObject2).toString(), i + ((String)localObject1).length() + 2, true);
            this.wvE.mTr.ae(localdr.chatroomName, localdr.userName, (String)localObject1);
            this.wvE.wDp = false;
            this.wvE.mTr.V(1, true);
            paramView.postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2199560126464L, 16388);
                cy.this.wvE.wDp = true;
                GMTrace.o(2199560126464L, 16388);
              }
            }, 2000L);
          }
        }
        while ((!s.fC(this.wvE.cci())) || (this.wvE.cci().contains("@"))) {
          for (;;)
          {
            GMTrace.o(2308947574784L, 17203);
            return true;
            localObject2 = AtSomeoneUI.a((com.tencent.mm.storage.q)localObject1, localdr.userName);
            localObject1 = localObject2;
            if (t.nm((String)localObject2)) {
              localObject1 = r.fq(localdr.userName);
            }
          }
        }
        g.ork.i(10976, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
        if ((this.wvE.txk) && (!this.wvE.wDj)) {}
        for (localObject1 = this.wvE.fs(localdr.userName);; localObject1 = r.fq(localdr.userName))
        {
          localObject2 = new StringBuffer(this.wvE.mTr.bMe());
          ((StringBuffer)localObject2).insert(i, (String)localObject1);
          this.wvE.mTr.p(((StringBuffer)localObject2).toString(), ((String)localObject1).length() + i, true);
          this.wvE.wDp = false;
          this.wvE.mTr.V(1, true);
          paramView.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2316866420736L, 17262);
              cy.this.wvE.wDp = true;
              GMTrace.o(2316866420736L, 17262);
            }
          }, 2000L);
          break;
        }
      }
      if (localdr.jHw == 9)
      {
        GMTrace.o(2308947574784L, 17203);
        return true;
      }
    }
    if ((paramView.getTag(R.h.cie) instanceof int[]))
    {
      localObject1 = (int[])paramView.getTag(R.h.cie);
      this.wvE.j(paramView, localObject1[0], localObject1[1]);
    }
    for (;;)
    {
      GMTrace.o(2308947574784L, 17203);
      return true;
      if (((this.juH == 0) && (this.juI == 0)) || (!this.wrx.equals(paramView))) {
        paramView.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(14664360525824L, 109258);
            cy.this.juH = ((int)paramAnonymousMotionEvent.getRawX());
            cy.this.juI = ((int)paramAnonymousMotionEvent.getRawY());
            cy.this.wrx = paramAnonymousView;
            GMTrace.o(14664360525824L, 109258);
            return false;
          }
        });
      } else {
        this.wvE.j(paramView, this.juH, this.juI);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */