package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavRecordDetailUI
  extends RecordMsgBaseUI
{
  private boolean eON;
  private String lgU;
  private long liK;
  private com.tencent.mm.plugin.record.a.c ohK;
  private boolean ohL;
  private com.tencent.mm.sdk.b.c ohM;
  
  public FavRecordDetailUI()
  {
    GMTrace.i(7551760465920L, 56265);
    this.liK = -1L;
    this.eON = true;
    this.lgU = String.valueOf(this.liK);
    this.ohL = true;
    this.ohM = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7551760465920L, 56265);
  }
  
  protected final void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7553102643200L, 56275);
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      Object localObject = new ft();
      ((ft)localObject).eIo.type = 32;
      ((ft)localObject).eIo.eDp = this.liK;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if (((ft)localObject).eIp.eIE)
      {
        com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.cPM));
        GMTrace.o(7553102643200L, 56275);
        return;
      }
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label244;
        }
      }
      label244:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        final com.tencent.mm.ui.base.r localr = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
        ft localft = new ft();
        localft.eIo.type = 13;
        localft.eIo.context = this.vKB.vKW;
        localft.eIo.toUser = ((String)localObject);
        localft.eIo.eIu = paramIntent;
        localft.eIo.eDp = this.liK;
        localft.eIo.eIt = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7531225153536L, 56112);
            localr.dismiss();
            com.tencent.mm.ui.snackbar.a.e(FavRecordDetailUI.this, FavRecordDetailUI.this.getString(R.l.dwg));
            GMTrace.o(7531225153536L, 56112);
          }
        };
        com.tencent.mm.sdk.b.a.vgX.m(localft);
        GMTrace.o(7553102643200L, 56275);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
    }
    GMTrace.o(7553102643200L, 56275);
  }
  
  protected final void baQ()
  {
    GMTrace.i(7552028901376L, 56267);
    this.liK = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.eON = getIntent().getBooleanExtra("show_share", true);
    this.ohK = com.tencent.mm.plugin.record.a.d.de(this.liK);
    this.lgU = String.valueOf(this.liK);
    if (this.ohK == null)
    {
      finish();
      GMTrace.o(7552028901376L, 56267);
      return;
    }
    b localb = new b();
    localb.ohE = this.ohK;
    localb.ohD = this.ohK.field_favProto.ulB;
    Object localObject = localb.ohD;
    if (localObject == null) {
      this.ohL = false;
    }
    for (;;)
    {
      super.baQ();
      this.ohZ.a(localb);
      com.tencent.mm.sdk.b.a.vgX.b(this.ohM);
      com.tencent.mm.sdk.b.a.vgX.b(((d)this.ohZ).ohG);
      GMTrace.o(7552028901376L, 56267);
      return;
      if (((List)localObject).size() == 0)
      {
        this.ohL = false;
      }
      else
      {
        localObject = ((List)localObject).iterator();
        for (;;)
        {
          if (((Iterator)localObject).hasNext()) {
            if (((th)((Iterator)localObject).next()).ukB != 0)
            {
              this.ohL = false;
              break;
            }
          }
        }
        this.ohL = true;
      }
    }
  }
  
  protected final h baR()
  {
    GMTrace.i(7552163119104L, 56268);
    d locald = new d(this, new c(this));
    GMTrace.o(7552163119104L, 56268);
    return locald;
  }
  
  protected final String baS()
  {
    GMTrace.i(7552565772288L, 56271);
    Object localObject;
    if ((14 == this.ohK.field_type) && (!bg.nm(this.ohK.field_favProto.title))) {
      localObject = this.ohK.field_favProto.title;
    }
    for (;;)
    {
      GMTrace.o(7552565772288L, 56271);
      return (String)localObject;
      tw localtw = this.ohK.field_favProto.ulz;
      if ((localtw != null) && (!bg.nm(localtw.ulb)))
      {
        String str1 = com.tencent.mm.y.r.fs(localtw.ulb);
        String str2;
        if (q.zE().equals(localtw.eMI))
        {
          str2 = m.ft(localtw.toUser);
          localObject = str1;
          if (!bg.aq(str2, "").equals(localtw.toUser)) {
            localObject = str1 + " - " + str2;
          }
        }
        for (;;)
        {
          w.v("MicroMsg.FavRecordDetailUI", "display name, source from[%s] to[%s]", new Object[] { localtw.eMI, localtw.toUser });
          break;
          str2 = m.ft(localtw.eMI);
          localObject = str1;
          if (!bg.aq(str2, "").equals(localtw.eMI)) {
            localObject = str1 + " - " + str2;
          }
        }
      }
      w.v("MicroMsg.FavRecordDetailUI", "display name, from item info user[%s]", new Object[] { this.ohK.field_fromUser });
      localObject = m.ft(this.ohK.field_fromUser);
    }
  }
  
  protected final String baT()
  {
    GMTrace.i(7552699990016L, 56272);
    Object localObject = this.ohK.field_favProto.ulB;
    if (((LinkedList)localObject).size() > 0)
    {
      localObject = ((th)((LinkedList)localObject).getFirst()).ukr;
      GMTrace.o(7552699990016L, 56272);
      return (String)localObject;
    }
    GMTrace.o(7552699990016L, 56272);
    return null;
  }
  
  protected final String baU()
  {
    GMTrace.i(7552834207744L, 56273);
    Object localObject = this.ohK.field_favProto.ulB;
    if (((LinkedList)localObject).size() > 0)
    {
      localObject = ((th)((LinkedList)localObject).getLast()).ukr;
      GMTrace.o(7552834207744L, 56273);
      return (String)localObject;
    }
    GMTrace.o(7552834207744L, 56273);
    return null;
  }
  
  protected final void baV()
  {
    GMTrace.i(7552968425472L, 56274);
    if (!this.eON)
    {
      GMTrace.o(7552968425472L, 56274);
      return;
    }
    a(0, R.l.eex, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7556592304128L, 56301);
        paramAnonymousMenuItem = new f(FavRecordDetailUI.this.vKB.vKW, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(7534983249920L, 56140);
            w.i("MicroMsg.FavRecordDetailUI", "favItemInfo: id %d, status %d", new Object[] { Integer.valueOf(FavRecordDetailUI.b(FavRecordDetailUI.this).field_id), Integer.valueOf(FavRecordDetailUI.b(FavRecordDetailUI.this).field_itemStatus) });
            if ((FavRecordDetailUI.b(FavRecordDetailUI.this).field_id > 0) && (!FavRecordDetailUI.b(FavRecordDetailUI.this).axJ()) && (!FavRecordDetailUI.b(FavRecordDetailUI.this).axK()) && (FavRecordDetailUI.c(FavRecordDetailUI.this))) {
              paramAnonymous2n.e(0, FavRecordDetailUI.this.getString(R.l.duL));
            }
            paramAnonymous2n.e(3, FavRecordDetailUI.this.getString(R.l.dtk));
            paramAnonymous2n.e(2, FavRecordDetailUI.this.getString(R.l.cSt));
            GMTrace.o(7534983249920L, 56140);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(7535654338560L, 56145);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(7535654338560L, 56145);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("scene_from", 1);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("select_fav_local_id", FavRecordDetailUI.b(FavRecordDetailUI.this).field_localId);
              com.tencent.mm.bj.d.a(FavRecordDetailUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 4097);
              g.ork.i(10651, new Object[] { Integer.valueOf(14), Integer.valueOf(1), Integer.valueOf(0) });
              GMTrace.o(7535654338560L, 56145);
              return;
              com.tencent.mm.ui.base.h.a(FavRecordDetailUI.this.vKB.vKW, FavRecordDetailUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(7543975837696L, 56207);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavRecordDetailUI.this.vKB.vKW, FavRecordDetailUI.this.getString(R.l.cSu), false, null);
                  ft localft = new ft();
                  localft.eIo.type = 12;
                  localft.eIo.eDp = FavRecordDetailUI.a(FavRecordDetailUI.this);
                  localft.eIo.eIt = new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(7551357812736L, 56262);
                      paramAnonymous3DialogInterface.dismiss();
                      w.d("MicroMsg.FavRecordDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavRecordDetailUI.a(FavRecordDetailUI.this)) });
                      FavRecordDetailUI.this.finish();
                      GMTrace.o(7551357812736L, 56262);
                    }
                  };
                  com.tencent.mm.sdk.b.a.vgX.m(localft);
                  GMTrace.o(7543975837696L, 56207);
                }
              }, null);
              GMTrace.o(7535654338560L, 56145);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavRecordDetailUI.a(FavRecordDetailUI.this));
              com.tencent.mm.bj.d.b(FavRecordDetailUI.this.vKB.vKW, "favorite", ".ui.FavTagEditUI", paramAnonymous2MenuItem);
              GMTrace.o(7535654338560L, 56145);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 1);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavRecordDetailUI.b(FavRecordDetailUI.this).field_localId);
              com.tencent.mm.bj.d.b(FavRecordDetailUI.this.vKB.vKW, "favorite", ".ui.FavTagEditUI", paramAnonymous2MenuItem);
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(7556592304128L, 56301);
        return true;
      }
    });
    GMTrace.o(7552968425472L, 56274);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7551894683648L, 56266);
    super.onCreate(paramBundle);
    GMTrace.o(7551894683648L, 56266);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16877745078272L, 125749);
    if (this.ohM != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.ohM);
    }
    if ((this.ohZ != null) && (((d)this.ohZ).ohG != null)) {
      com.tencent.mm.sdk.b.a.vgX.c(((d)this.ohZ).ohG);
    }
    super.onDestroy();
    GMTrace.o(16877745078272L, 125749);
  }
  
  protected void onResume()
  {
    GMTrace.i(7552297336832L, 56269);
    super.onResume();
    Object localObject2 = (b)((d)this.ohZ).ohV;
    com.tencent.mm.plugin.record.a.c localc;
    Object localObject1;
    if (((b)localObject2).ohE != null)
    {
      localc = com.tencent.mm.plugin.record.a.d.de(((b)localObject2).ohE.field_localId);
      if ((localc == null) || (localc.field_favProto == null))
      {
        GMTrace.o(7552297336832L, 56269);
        return;
      }
      localObject1 = localc.field_favProto.ulB;
      localObject2 = ((b)localObject2).ohD.iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
      } while (((LinkedList)localObject1).contains((th)((Iterator)localObject2).next()));
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject1 = new b();
        ((b)localObject1).ohE = localc;
        ((b)localObject1).ohD = localc.field_favProto.ulB;
        this.ohZ.a((a)localObject1);
      }
      GMTrace.o(7552297336832L, 56269);
      return;
    }
  }
  
  protected void onStop()
  {
    GMTrace.i(7552431554560L, 56270);
    super.onStop();
    GMTrace.o(7552431554560L, 56270);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\FavRecordDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */