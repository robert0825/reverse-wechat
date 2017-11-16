package com.tencent.mm.plugin.card.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.protocal.c.pv;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class l
  extends i
{
  public View jKn;
  public LinearLayout jKo;
  public boolean jKp;
  
  public l()
  {
    GMTrace.i(4998536626176L, 37242);
    this.jKp = false;
    GMTrace.o(4998536626176L, 37242);
  }
  
  public final void MP()
  {
    GMTrace.i(4998670843904L, 37243);
    GMTrace.o(4998670843904L, 37243);
  }
  
  public final void amM()
  {
    GMTrace.i(4998939279360L, 37245);
    if (this.jKn != null) {
      this.jKn.setVisibility(8);
    }
    GMTrace.o(4998939279360L, 37245);
  }
  
  public final void update()
  {
    GMTrace.i(4998805061632L, 37244);
    if (this.jKn == null) {
      this.jKn = ((ViewStub)findViewById(R.h.bjT)).inflate();
    }
    final Object localObject = this.jKl.alv().ajw().tZp;
    ((TextView)this.jKn.findViewById(R.h.btH)).setText(((pv)localObject).title);
    if ((((pv)localObject).ufS != null) && (((pv)localObject).ufS.size() > 0))
    {
      this.jKo = ((LinearLayout)this.jKn.findViewById(R.h.btG));
      this.jKo.removeAllViews();
      final LinkedList localLinkedList = ((pv)localObject).ufS;
      final LayoutInflater localLayoutInflater = (LayoutInflater)this.jKl.aly().getSystemService("layout_inflater");
      if ((((pv)localObject).ufR >= localLinkedList.size()) || (this.jKp))
      {
        this.jKn.findViewById(R.h.btF).setVisibility(8);
        i = 0;
        while (i < localLinkedList.size())
        {
          localObject = (TextView)localLayoutInflater.inflate(R.i.crF, null, false);
          ((TextView)localObject).setText(((np)localLinkedList.get(i)).title);
          this.jKo.addView((View)localObject);
          i += 1;
        }
        this.jKo.invalidate();
        GMTrace.o(4998805061632L, 37244);
        return;
      }
      int i = 0;
      while (i < ((pv)localObject).ufR)
      {
        TextView localTextView = (TextView)localLayoutInflater.inflate(R.i.crF, null, false);
        localTextView.setText(((np)localLinkedList.get(i)).title);
        this.jKo.addView(localTextView);
        i += 1;
      }
      this.jKo.invalidate();
      this.jKn.findViewById(R.h.btF).setVisibility(0);
      this.jKn.findViewById(R.h.btF).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4999476150272L, 37249);
          l.this.jKp = true;
          l.this.jKn.findViewById(R.h.btF).setVisibility(8);
          int i = localObject.ufR;
          while (i < localLinkedList.size())
          {
            paramAnonymousView = (TextView)localLayoutInflater.inflate(R.i.crF, null, false);
            paramAnonymousView.setText(((np)localLinkedList.get(i)).title);
            l.this.jKo.addView(paramAnonymousView);
            i += 1;
          }
          l.this.jKo.invalidate();
          GMTrace.o(4999476150272L, 37249);
        }
      });
    }
    GMTrace.o(4998805061632L, 37244);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */