package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public abstract class RecordMsgBaseUI
  extends MMActivity
{
  protected long eDr;
  protected ListView juD;
  protected h ohZ;
  
  public RecordMsgBaseUI()
  {
    GMTrace.i(7523306307584L, 56053);
    this.juD = null;
    this.eDr = -1L;
    GMTrace.o(7523306307584L, 56053);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7523574743040L, 56055);
    GMTrace.o(7523574743040L, 56055);
    return 1;
  }
  
  protected abstract void b(int paramInt1, int paramInt2, Intent paramIntent);
  
  protected void baQ()
  {
    GMTrace.i(7523977396224L, 56058);
    this.ohZ = baR();
    this.eDr = getIntent().getLongExtra("message_id", -1L);
    this.juD = ((ListView)findViewById(R.h.bXN));
    baY();
    final Object localObject = baT();
    String str = baU();
    if ((bg.nm((String)localObject)) || (bg.nm(str)))
    {
      w.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
      localObject = new View(this.vKB.vKW);
      ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.f.aQI)));
      this.juD.addHeaderView((View)localObject, null, false);
      localObject = View.inflate(this.vKB.vKW, R.i.cEF, null);
      this.juD.setAdapter(this.ohZ);
      this.ohZ.Ev = this.juD;
      this.ohZ.baW();
      this.juD.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(7557934481408L, 56311);
          GMTrace.o(7557934481408L, 56311);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(7557800263680L, 56310);
          if (paramAnonymousInt == 0)
          {
            paramAnonymousAbsListView = new rm();
            paramAnonymousAbsListView.eWo.type = 5;
            paramAnonymousAbsListView.eWo.eWp = RecordMsgBaseUI.this.juD.getFirstVisiblePosition();
            paramAnonymousAbsListView.eWo.eWq = RecordMsgBaseUI.this.juD.getLastVisiblePosition();
            paramAnonymousAbsListView.eWo.eWr = RecordMsgBaseUI.this.juD.getHeaderViewsCount();
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousAbsListView);
          }
          GMTrace.o(7557800263680L, 56310);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7525722226688L, 56071);
          RecordMsgBaseUI.this.finish();
          GMTrace.o(7525722226688L, 56071);
          return true;
        }
      });
      baV();
      this.juD.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7527064403968L, 56081);
          View localView = RecordMsgBaseUI.this.juD.getChildAt(RecordMsgBaseUI.this.juD.getLastVisiblePosition());
          if (localView != null)
          {
            int i = localView.getBottom();
            int j = RecordMsgBaseUI.this.juD.getBottom();
            int k = com.tencent.mm.br.a.fromDPToPix(RecordMsgBaseUI.this.vKB.vKW, 64);
            w.d("MicroMsg.RecordMsgBaseUI", "lastBotm %s, listBotm %s, listEndmargin %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
            if (i < j - k)
            {
              i = j - i - k;
              w.d("MicroMsg.RecordMsgBaseUI", "offset %d", new Object[] { Integer.valueOf(i) });
              localObject.setPadding(0, i, 0, 0);
            }
          }
          RecordMsgBaseUI.this.juD.addFooterView(localObject, null, false);
          GMTrace.o(7527064403968L, 56081);
        }
      }, 100L);
      GMTrace.o(7523977396224L, 56058);
      return;
    }
    localObject = localObject.split(" ")[0];
    str = str.split(" ")[0];
    if (((String)localObject).equals(str)) {}
    for (this.ohZ.ohT = false;; this.ohZ.ohT = true)
    {
      Ve((String)localObject);
      break;
      localObject = (String)localObject + "~" + str;
    }
  }
  
  protected abstract h baR();
  
  protected abstract String baS();
  
  protected abstract String baT();
  
  protected abstract String baU();
  
  protected abstract void baV();
  
  protected final void baY()
  {
    GMTrace.i(16881234739200L, 125775);
    String str2 = baS();
    String str3 = this.vKB.vKW.getString(R.l.dsh);
    String str1 = str2;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.endsWith(str3))
      {
        str1 = str2;
        if (str2.lastIndexOf(str3) > 0) {
          str1 = str2.substring(0, str2.lastIndexOf(str3) - 1);
        }
      }
    }
    N(com.tencent.mm.pluginsdk.ui.d.h.c(this.vKB.vKW, str1, getResources().getDimensionPixelSize(R.f.aPz)));
    GMTrace.o(16881234739200L, 125775);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7523440525312L, 56054);
    int i = R.i.cEG;
    GMTrace.o(7523440525312L, 56054);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7524514267136L, 56062);
    b(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7524514267136L, 56062);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7523708960768L, 56056);
    e.g(this);
    super.onCreate(paramBundle);
    baQ();
    e.h(this);
    GMTrace.o(7523708960768L, 56056);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7524380049408L, 56061);
    super.onDestroy();
    if (this.ohZ != null) {
      this.ohZ.destroy();
    }
    GMTrace.o(7524380049408L, 56061);
  }
  
  protected void onPause()
  {
    GMTrace.i(7524245831680L, 56060);
    super.onPause();
    if (this.ohZ != null)
    {
      localObject = this.ohZ;
      int i = 0;
      while (i < ((h)localObject).ohS.size())
      {
        h.b localb = (h.b)((h)localObject).ohS.valueAt(i);
        if (localb != null) {
          localb.pause();
        }
        i += 1;
      }
    }
    Object localObject = new rm();
    ((rm)localObject).eWo.type = 1;
    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    GMTrace.o(7524245831680L, 56060);
  }
  
  protected void onResume()
  {
    GMTrace.i(7524111613952L, 56059);
    super.onResume();
    rm localrm = new rm();
    if (this.juD != null)
    {
      localrm.eWo.type = 0;
      localrm.eWo.eWp = this.juD.getFirstVisiblePosition();
      localrm.eWo.eWq = this.juD.getLastVisiblePosition();
      localrm.eWo.eWr = this.juD.getHeaderViewsCount();
      com.tencent.mm.sdk.b.a.vgX.m(localrm);
    }
    GMTrace.o(7524111613952L, 56059);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\RecordMsgBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */