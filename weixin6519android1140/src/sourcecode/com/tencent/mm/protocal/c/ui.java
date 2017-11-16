package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ui
  extends ayx
{
  public String nFI;
  public String tUD;
  public String ugx;
  public String umF;
  public String umG;
  public String umH;
  
  public ui()
  {
    GMTrace.i(4002506866688L, 29821);
    GMTrace.o(4002506866688L, 29821);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4002641084416L, 29822);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.umF != null) {
        paramVarArgs.e(2, this.umF);
      }
      if (this.tUD != null) {
        paramVarArgs.e(3, this.tUD);
      }
      if (this.nFI != null) {
        paramVarArgs.e(4, this.nFI);
      }
      if (this.umG != null) {
        paramVarArgs.e(5, this.umG);
      }
      if (this.umH != null) {
        paramVarArgs.e(6, this.umH);
      }
      if (this.ugx != null) {
        paramVarArgs.e(7, this.ugx);
      }
      GMTrace.o(4002641084416L, 29822);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.umF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umF);
      }
      i = paramInt;
      if (this.tUD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUD);
      }
      paramInt = i;
      if (this.nFI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nFI);
      }
      i = paramInt;
      if (this.umG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.umG);
      }
      paramInt = i;
      if (this.umH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.umH);
      }
      i = paramInt;
      if (this.ugx != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ugx);
      }
      GMTrace.o(4002641084416L, 29822);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4002641084416L, 29822);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ui localui = (ui)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4002641084416L, 29822);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localui.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002641084416L, 29822);
        return 0;
      case 2: 
        localui.umF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002641084416L, 29822);
        return 0;
      case 3: 
        localui.tUD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002641084416L, 29822);
        return 0;
      case 4: 
        localui.nFI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002641084416L, 29822);
        return 0;
      case 5: 
        localui.umG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002641084416L, 29822);
        return 0;
      case 6: 
        localui.umH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002641084416L, 29822);
        return 0;
      }
      localui.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4002641084416L, 29822);
      return 0;
    }
    GMTrace.o(4002641084416L, 29822);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */