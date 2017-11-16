package com.tencent.mm.ui.chatting;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class em
{
  private static LinkedList<View> wHv;
  private static LinkedList<View> wHw;
  
  static
  {
    GMTrace.i(2302907777024L, 17158);
    wHv = new LinkedList();
    wHw = new LinkedList();
    GMTrace.o(2302907777024L, 17158);
  }
  
  public static View CT(int paramInt)
  {
    GMTrace.i(2302505123840L, 17155);
    if (paramInt == 1) {}
    for (Object localObject = wHv; ((LinkedList)localObject).size() != 0; localObject = wHw)
    {
      localObject = (View)((LinkedList)localObject).removeFirst();
      GMTrace.o(2302505123840L, 17155);
      return (View)localObject;
    }
    GMTrace.o(2302505123840L, 17155);
    return null;
  }
  
  public static void J(View paramView, int paramInt)
  {
    GMTrace.i(2302639341568L, 17156);
    if (paramInt == 1) {}
    for (LinkedList localLinkedList = wHv;; localLinkedList = wHw)
    {
      if (localLinkedList.size() >= 35) {
        localLinkedList.removeFirst();
      }
      localLinkedList.addLast(paramView);
      GMTrace.o(2302639341568L, 17156);
      return;
    }
  }
  
  public static void clear()
  {
    GMTrace.i(2302773559296L, 17157);
    wHv.clear();
    wHw.clear();
    GMTrace.o(2302773559296L, 17157);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */