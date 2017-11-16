package com.tencent.mm.plugin.favorite.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.favorite.b.ah;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aox;
import com.tencent.mm.protocal.c.apa;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.MMTextInputUI;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class FavTextEditUI
  extends MMTextInputUI
{
  public FavTextEditUI()
  {
    GMTrace.i(6312259747840L, 47030);
    GMTrace.o(6312259747840L, 47030);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6312393965568L, 47031);
    int i = R.i.cwq;
    GMTrace.o(6312393965568L, 47031);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6312528183296L, 47032);
    super.onCreate(paramBundle);
    oM(R.l.dtl);
    GMTrace.o(6312528183296L, 47032);
  }
  
  protected final void y(CharSequence paramCharSequence)
  {
    GMTrace.i(6312662401024L, 47033);
    if ((paramCharSequence == null) || (bg.nm(paramCharSequence.toString())))
    {
      w.w("MicroMsg.FavTextEditUI", "text is null");
      GMTrace.o(6312662401024L, 47033);
      return;
    }
    int i = getIntent().getIntExtra("key_fav_item_id", -1);
    paramCharSequence = paramCharSequence.toString();
    if (i <= 0)
    {
      w.w("MicroMsg.ModFavItemLogic", "modEditText favid:%d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(6312662401024L, 47033);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = new aox();
    ((aox)localObject1).uEL = 4;
    ((aox)localObject1).uEM = 0;
    localLinkedList.add(localObject1);
    localObject1 = new LinkedList();
    Object localObject2 = new apa();
    ((apa)localObject2).lRR = "favitem.desc";
    ((apa)localObject2).oqQ = bg.aq(paramCharSequence, "");
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = new apa();
    ((apa)localObject2).lRR = "favitem.edittime";
    ((apa)localObject2).oqQ = String.valueOf(bg.Pu());
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = h.axB().cg(i);
    if (localObject2 != null)
    {
      ((j)localObject2).field_edittime = bg.Pu();
      ((j)localObject2).field_favProto.eD(((j)localObject2).field_edittime);
      ((j)localObject2).field_favProto.QX(bg.aq(paramCharSequence, ""));
      h.axB().a((j)localObject2, new String[] { "localId" });
    }
    paramCharSequence = new ah(i, localLinkedList, (LinkedList)localObject1);
    at.wS().a(paramCharSequence, 0);
    g.ork.i(10874, new Object[] { Integer.valueOf(1) });
    GMTrace.o(6312662401024L, 47033);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavTextEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */