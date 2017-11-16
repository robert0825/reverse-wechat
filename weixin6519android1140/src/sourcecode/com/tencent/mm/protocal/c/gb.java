package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gb
  extends ayx
{
  public int ePo;
  public String riG;
  public String tUk;
  public String tUl;
  public String tUm;
  
  public gb()
  {
    GMTrace.i(19137032093696L, 142582);
    GMTrace.o(19137032093696L, 142582);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19137166311424L, 142583);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUk != null) {
        paramVarArgs.e(2, this.tUk);
      }
      if (this.tUl != null) {
        paramVarArgs.e(3, this.tUl);
      }
      if (this.riG != null) {
        paramVarArgs.e(4, this.riG);
      }
      if (this.tUm != null) {
        paramVarArgs.e(5, this.tUm);
      }
      paramVarArgs.fk(7, this.ePo);
      GMTrace.o(19137166311424L, 142583);
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
      if (this.tUk != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tUk);
      }
      i = paramInt;
      if (this.tUl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUl);
      }
      paramInt = i;
      if (this.riG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.riG);
      }
      i = paramInt;
      if (this.tUm != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tUm);
      }
      paramInt = b.a.a.a.fh(7, this.ePo);
      GMTrace.o(19137166311424L, 142583);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19137166311424L, 142583);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gb localgb = (gb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 6: 
      default: 
        GMTrace.o(19137166311424L, 142583);
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
          localgb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19137166311424L, 142583);
        return 0;
      case 2: 
        localgb.tUk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137166311424L, 142583);
        return 0;
      case 3: 
        localgb.tUl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137166311424L, 142583);
        return 0;
      case 4: 
        localgb.riG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137166311424L, 142583);
        return 0;
      case 5: 
        localgb.tUm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19137166311424L, 142583);
        return 0;
      }
      localgb.ePo = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(19137166311424L, 142583);
      return 0;
    }
    GMTrace.o(19137166311424L, 142583);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */