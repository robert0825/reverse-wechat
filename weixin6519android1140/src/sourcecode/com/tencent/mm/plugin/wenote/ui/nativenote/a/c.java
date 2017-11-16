package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.plugin.wenote.ui.nativenote.b.a;
import com.tencent.mm.plugin.wenote.ui.nativenote.b.f;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends RecyclerView.a<a>
{
  private final String TAG;
  private k shJ;
  private f sjl;
  
  public c(k paramk)
  {
    GMTrace.i(17162957750272L, 127874);
    this.TAG = "MicroMsg.NoteEditorUI";
    this.shJ = paramk;
    this.sjl = new f();
    GMTrace.o(17162957750272L, 127874);
  }
  
  private void a(a parama, int paramInt)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(17163091968000L, 127875);
        w.i("MicroMsg.NoteEditorUI", "huahuastart: onBindViewHolder,position is %d", new Object[] { Integer.valueOf(paramInt) });
        b localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(paramInt);
        if (localb != null)
        {
          if (localb.getType() != parama.bIG())
          {
            GMTrace.o(17163091968000L, 127875);
            return;
          }
          parama.a(localb, paramInt, localb.getType());
          w.i("MicroMsg.NoteEditorUI", "huahuaend: onBindViewHolder,position is %d", new Object[] { Integer.valueOf(paramInt) });
          GMTrace.o(17163091968000L, 127875);
          continue;
        }
      }
      finally {}
      tmp114_111[0] = Integer.valueOf(paramInt);
      w.e("MicroMsg.NoteEditorUI", "onBindViewHolder, item is null, position is %d", tmp114_111);
    }
  }
  
  public final int getItemCount()
  {
    GMTrace.i(17163360403456L, 127877);
    int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().size();
    GMTrace.o(17163360403456L, 127877);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(17163226185728L, 127876);
    b localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().yD(paramInt);
    if (localb != null)
    {
      paramInt = localb.getType();
      GMTrace.o(17163226185728L, 127876);
      return paramInt;
    }
    w.e("MicroMsg.NoteEditorUI", "getItemViewType, item is null, position is %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(17163226185728L, 127876);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */