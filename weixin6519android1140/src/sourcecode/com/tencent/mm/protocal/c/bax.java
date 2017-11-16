package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bax
  extends com.tencent.mm.bm.a
{
  public String kBh;
  public int tOG;
  public all uBS;
  public String uOq;
  
  public bax()
  {
    GMTrace.i(19140790190080L, 142610);
    GMTrace.o(19140790190080L, 142610);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19140924407808L, 142611);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uOq != null) {
        paramVarArgs.e(1, this.uOq);
      }
      paramVarArgs.fk(2, this.tOG);
      if (this.kBh != null) {
        paramVarArgs.e(3, this.kBh);
      }
      if (this.uBS != null)
      {
        paramVarArgs.fm(4, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      GMTrace.o(19140924407808L, 142611);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uOq != null) {
        paramInt = b.a.a.b.b.a.f(1, this.uOq) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tOG);
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kBh);
      }
      i = paramInt;
      if (this.uBS != null) {
        i = paramInt + b.a.a.a.fj(4, this.uBS.aYq());
      }
      GMTrace.o(19140924407808L, 142611);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19140924407808L, 142611);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bax localbax = (bax)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19140924407808L, 142611);
        return -1;
      case 1: 
        localbax.uOq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140924407808L, 142611);
        return 0;
      case 2: 
        localbax.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19140924407808L, 142611);
        return 0;
      case 3: 
        localbax.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19140924407808L, 142611);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new all();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbax.uBS = ((all)localObject1);
        paramInt += 1;
      }
      GMTrace.o(19140924407808L, 142611);
      return 0;
    }
    GMTrace.o(19140924407808L, 142611);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */