package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ahj
  extends com.tencent.mm.bm.a
{
  public int uwM;
  public LinkedList<app> uwN;
  public int uwO;
  
  public ahj()
  {
    GMTrace.i(13096697462784L, 97578);
    this.uwN = new LinkedList();
    GMTrace.o(13096697462784L, 97578);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13096831680512L, 97579);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uwM);
      paramVarArgs.d(2, 8, this.uwN);
      paramVarArgs.fk(3, this.uwO);
      GMTrace.o(13096831680512L, 97579);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uwM);
      i = b.a.a.a.c(2, 8, this.uwN);
      int j = b.a.a.a.fh(3, this.uwO);
      GMTrace.o(13096831680512L, 97579);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uwN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13096831680512L, 97579);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ahj localahj = (ahj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13096831680512L, 97579);
        return -1;
      case 1: 
        localahj.uwM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096831680512L, 97579);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new app();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((app)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localahj.uwN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096831680512L, 97579);
        return 0;
      }
      localahj.uwO = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13096831680512L, 97579);
      return 0;
    }
    GMTrace.o(13096831680512L, 97579);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ahj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */