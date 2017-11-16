package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmg
  extends ayx
{
  public int aGl;
  public double altitude;
  public double latitude;
  public double longitude;
  public double uWd;
  public double uWe;
  
  public bmg()
  {
    GMTrace.i(3638374170624L, 27108);
    GMTrace.o(3638374170624L, 27108);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3638508388352L, 27109);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.latitude);
      paramVarArgs.a(3, this.longitude);
      paramVarArgs.a(4, this.altitude);
      paramVarArgs.a(5, this.uWd);
      paramVarArgs.a(6, this.uWe);
      paramVarArgs.fk(7, this.aGl);
      GMTrace.o(3638508388352L, 27109);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.b.b.a.cK(5);
      int n = b.a.a.b.b.a.cK(6);
      int i1 = b.a.a.a.fh(7, this.aGl);
      GMTrace.o(3638508388352L, 27109);
      return paramInt + (i + 8) + (j + 8) + (k + 8) + (m + 8) + (n + 8) + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3638508388352L, 27109);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmg localbmg = (bmg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3638508388352L, 27109);
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
          localbmg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 2: 
        localbmg.latitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 3: 
        localbmg.longitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 4: 
        localbmg.altitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 5: 
        localbmg.uWd = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      case 6: 
        localbmg.uWe = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3638508388352L, 27109);
        return 0;
      }
      localbmg.aGl = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3638508388352L, 27109);
      return 0;
    }
    GMTrace.o(3638508388352L, 27109);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */