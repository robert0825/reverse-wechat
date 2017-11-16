package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.emoji.f.s;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.DragSortListView;
import com.tencent.mm.ui.widget.DragSortListView.g;
import com.tencent.mm.ui.widget.DragSortListView.l;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmojiSortUI
  extends EmojiBaseActivity
  implements com.tencent.mm.ad.e, j.a
{
  ProgressDialog kgz;
  private com.tencent.mm.plugin.emoji.a.e kpl;
  private DragSortListView kpm;
  private s kpn;
  private DragSortListView.g kpo;
  private DragSortListView.l kpp;
  private ArrayList<EmojiGroupInfo> mData;
  
  public EmojiSortUI()
  {
    GMTrace.i(11465146761216L, 85422);
    this.mData = new ArrayList();
    this.kpo = new DragSortListView.g()
    {
      public final void bW(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11464744108032L, 85419);
        EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)EmojiSortUI.b(EmojiSortUI.this).getItem(paramAnonymousInt1);
        EmojiSortUI.b(EmojiSortUI.this).remove(localEmojiGroupInfo);
        EmojiSortUI.b(EmojiSortUI.this).insert(localEmojiGroupInfo, paramAnonymousInt2);
        GMTrace.o(11464744108032L, 85419);
      }
    };
    this.kpp = new DragSortListView.l()
    {
      public final void remove(int paramAnonymousInt)
      {
        GMTrace.i(11371194351616L, 84722);
        EmojiSortUI.b(EmojiSortUI.this).remove(EmojiSortUI.b(EmojiSortUI.this).getItem(paramAnonymousInt));
        GMTrace.o(11371194351616L, 84722);
      }
    };
    GMTrace.o(11465146761216L, 85422);
  }
  
  protected final void MP()
  {
    GMTrace.i(11465683632128L, 85426);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11401661775872L, 84949);
        EmojiSortUI.this.finish();
        GMTrace.o(11401661775872L, 84949);
        return true;
      }
    });
    sq(getString(R.l.dYO));
    a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11419646951424L, 85083);
        if (!am.isConnected(ab.getContext())) {
          EmojiSortUI.a(EmojiSortUI.this);
        }
        for (;;)
        {
          GMTrace.o(11419646951424L, 85083);
          return true;
          paramAnonymousMenuItem = EmojiSortUI.this;
          paramAnonymousMenuItem.getString(R.l.cUG);
          paramAnonymousMenuItem.kgz = com.tencent.mm.ui.base.h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(R.l.cUV), true, new EmojiSortUI.3(paramAnonymousMenuItem));
          paramAnonymousMenuItem = new ArrayList();
          if ((EmojiSortUI.b(EmojiSortUI.this) != null) && (EmojiSortUI.b(EmojiSortUI.this).kgE != null))
          {
            Iterator localIterator = EmojiSortUI.b(EmojiSortUI.this).kgE.iterator();
            while (localIterator.hasNext()) {
              paramAnonymousMenuItem.add(((EmojiGroupInfo)localIterator.next()).field_productID);
            }
          }
          EmojiSortUI.a(EmojiSortUI.this, new s(paramAnonymousMenuItem, 2));
          at.wS().a(EmojiSortUI.c(EmojiSortUI.this), 0);
        }
      }
    });
    ((TextView)findViewById(16908310)).setText(R.l.doL);
    GMTrace.o(11465683632128L, 85426);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11466220503040L, 85430);
    w.d("MicroMsg.emoji.EmojiSortUI", "ErrType:" + paramInt1 + "   errCode:" + paramInt2);
    if (this.kgz != null) {
      this.kgz.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt1 == 0))
    {
      this.kpl.aqm();
      finish();
      GMTrace.o(11466220503040L, 85430);
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.dor), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11390521704448L, 84866);
        GMTrace.o(11390521704448L, 84866);
      }
    });
    GMTrace.o(11466220503040L, 85430);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(11465817849856L, 85427);
    if ((paramString != null) && (paramString.equals("event_update_group")) && (this.kpl != null))
    {
      paramString = this.kpl;
      paraml = com.tencent.mm.plugin.emoji.model.h.arl().kjz.bUL();
      paramString.clear();
      paraml = paraml.iterator();
      while (paraml.hasNext()) {
        paramString.insert((EmojiGroupInfo)paraml.next(), paramString.getCount());
      }
      paramString.notifyDataSetChanged();
    }
    GMTrace.o(11465817849856L, 85427);
  }
  
  public final void g(Message paramMessage)
  {
    GMTrace.i(11465952067584L, 85428);
    GMTrace.o(11465952067584L, 85428);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11465549414400L, 85425);
    int i = R.i.cuE;
    GMTrace.o(11465549414400L, 85425);
    return i;
  }
  
  public final void h(Message paramMessage)
  {
    GMTrace.i(11466086285312L, 85429);
    GMTrace.o(11466086285312L, 85429);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11465280978944L, 85423);
    super.onCreate(paramBundle);
    MP();
    this.mData = com.tencent.mm.plugin.emoji.model.h.arl().kjz.bUL();
    this.kpm = ((DragSortListView)findViewById(16908298));
    this.kpm.xnZ = this.kpo;
    this.kpm.xoa = this.kpp;
    this.kpl = new com.tencent.mm.plugin.emoji.a.e(this.vKB.vKW, this.mData);
    this.kpm.setAdapter(this.kpl);
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.c(this);
    at.wS().a(717, this);
    GMTrace.o(11465280978944L, 85423);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11465415196672L, 85424);
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.j(this);
    at.wS().b(717, this);
    super.onDestroy();
    GMTrace.o(11465415196672L, 85424);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiSortUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */