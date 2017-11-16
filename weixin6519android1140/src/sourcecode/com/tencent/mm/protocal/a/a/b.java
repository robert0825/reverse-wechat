package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public int nettype;
  public int tLe;
  public LinkedList<a> tLf;
  public int uin;
  
  public b()
  {
    GMTrace.i(13100858212352L, 97609);
    this.tLf = new LinkedList();
    GMTrace.o(13100858212352L, 97609);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13100992430080L, 97610);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uin);
      paramVarArgs.fk(2, this.tLe);
      paramVarArgs.d(3, 8, this.tLf);
      paramVarArgs.fk(4, this.nettype);
      GMTrace.o(13100992430080L, 97610);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uin);
      i = b.a.a.a.fh(2, this.tLe);
      int j = b.a.a.a.c(3, 8, this.tLf);
      int k = b.a.a.a.fh(4, this.nettype);
      GMTrace.o(13100992430080L, 97610);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tLf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13100992430080L, 97610);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13100992430080L, 97610);
        return -1;
      case 1: 
        localb.uin = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13100992430080L, 97610);
        return 0;
      case 2: 
        localb.tLe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13100992430080L, 97610);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localb.tLf.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13100992430080L, 97610);
        return 0;
      }
      localb.nettype = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13100992430080L, 97610);
      return 0;
    }
    GMTrace.o(13100992430080L, 97610);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */