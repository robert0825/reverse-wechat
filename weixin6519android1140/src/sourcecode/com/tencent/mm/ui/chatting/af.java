package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class af
{
  private x eMY;
  public boolean wqK;
  public En_5b8fbb1e.a wuU;
  public cv wuV;
  ChatFooter wuW;
  ChatFooterCustom wuX;
  private boolean wuY;
  long[] wuZ;
  
  public af(En_5b8fbb1e.a parama, cv paramcv, ChatFooter paramChatFooter, ChatFooterCustom paramChatFooterCustom, x paramx, boolean paramBoolean, long[] paramArrayOfLong)
  {
    GMTrace.i(2179024814080L, 16235);
    this.wuY = false;
    this.wuZ = null;
    this.wuU = parama;
    this.wuW = paramChatFooter;
    this.wuX = paramChatFooterCustom;
    this.wuV = paramcv;
    this.eMY = paramx;
    this.wqK = paramBoolean;
    this.wuZ = paramArrayOfLong;
    this.wuU.vKB.bXE();
    parama = this.wuU;
    paramcv = this.wuU.getString(R.l.daH);
    paramChatFooter = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2169226919936L, 16162);
        paramAnonymousMenuItem = new Intent();
        Object localObject2 = af.this.wuV.wzw;
        if (localObject2 != null)
        {
          Object localObject1 = new ArrayList();
          localObject2 = ((Set)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            Long localLong = (Long)((Iterator)localObject2).next();
            if (localLong != null) {
              ((List)localObject1).add(localLong);
            }
          }
          localObject2 = new long[((List)localObject1).size()];
          localObject1 = ((List)localObject1).iterator();
          int i = 0;
          while (((Iterator)localObject1).hasNext())
          {
            localObject2[i] = ((Long)((Iterator)localObject1).next()).longValue();
            i += 1;
          }
          paramAnonymousMenuItem.putExtra("k_outside_expose_proof_item_list", (long[])localObject2);
          af.this.wuU.bWQ().setResult(-1, paramAnonymousMenuItem);
        }
        for (;;)
        {
          paramAnonymousMenuItem.putExtra("k_is_group_chat", af.this.wqK);
          af.this.wuU.finish();
          GMTrace.o(2169226919936L, 16162);
          return false;
          af.this.wuU.bWQ().setResult(0, paramAnonymousMenuItem);
        }
      }
    };
    int i = p.b.vLG;
    parama.vKB.a(2, paramcv, paramChatFooter, null, i);
    this.wuV.wzG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2245596807168L, 16731);
        af.this.wuV.eX(((Long)paramAnonymousView.getTag()).longValue());
        GMTrace.o(2245596807168L, 16731);
      }
    };
    GMTrace.o(2179024814080L, 16235);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */