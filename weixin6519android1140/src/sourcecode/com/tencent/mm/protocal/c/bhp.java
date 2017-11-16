package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhp
  extends com.tencent.mm.bm.a
{
  public int uTA;
  public LinkedList<aqi> uTB;
  public int uTz;
  
  public bhp()
  {
    GMTrace.i(13096429027328L, 97576);
    this.uTB = new LinkedList();
    GMTrace.o(13096429027328L, 97576);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13096563245056L, 97577);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uTz);
      paramVarArgs.fk(2, this.uTA);
      paramVarArgs.d(3, 8, this.uTB);
      GMTrace.o(13096563245056L, 97577);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uTz);
      i = b.a.a.a.fh(2, this.uTA);
      int j = b.a.a.a.c(3, 8, this.uTB);
      GMTrace.o(13096563245056L, 97577);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uTB.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13096563245056L, 97577);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhp localbhp = (bhp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13096563245056L, 97577);
        return -1;
      case 1: 
        localbhp.uTz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096563245056L, 97577);
        return 0;
      case 2: 
        localbhp.uTA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096563245056L, 97577);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aqi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((aqi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbhp.uTB.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13096563245056L, 97577);
      return 0;
    }
    GMTrace.o(13096563245056L, 97577);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */