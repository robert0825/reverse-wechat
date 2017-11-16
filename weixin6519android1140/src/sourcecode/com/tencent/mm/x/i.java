package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class i
  extends com.tencent.mm.bm.a
{
  public String eTo;
  public String eTp;
  public String fwt;
  public LinkedList<l> glr;
  public int gls;
  public String name;
  public int type;
  
  public i()
  {
    GMTrace.i(312861523968L, 2331);
    this.glr = new LinkedList();
    GMTrace.o(312861523968L, 2331);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(312995741696L, 2332);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.type);
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      if (this.eTo != null) {
        paramVarArgs.e(3, this.eTo);
      }
      if (this.eTp != null) {
        paramVarArgs.e(4, this.eTp);
      }
      if (this.fwt != null) {
        paramVarArgs.e(5, this.fwt);
      }
      paramVarArgs.d(6, 8, this.glr);
      paramVarArgs.fk(7, this.gls);
      GMTrace.o(312995741696L, 2332);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.type) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt;
      if (this.eTo != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eTo);
      }
      paramInt = i;
      if (this.eTp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.eTp);
      }
      i = paramInt;
      if (this.fwt != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.fwt);
      }
      paramInt = b.a.a.a.c(6, 8, this.glr);
      int j = b.a.a.a.fh(7, this.gls);
      GMTrace.o(312995741696L, 2332);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.glr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(312995741696L, 2332);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(312995741696L, 2332);
        return -1;
      case 1: 
        locali.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(312995741696L, 2332);
        return 0;
      case 2: 
        locali.name = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(312995741696L, 2332);
        return 0;
      case 3: 
        locali.eTo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(312995741696L, 2332);
        return 0;
      case 4: 
        locali.eTp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(312995741696L, 2332);
        return 0;
      case 5: 
        locali.fwt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(312995741696L, 2332);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new l();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((l)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locali.glr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(312995741696L, 2332);
        return 0;
      }
      locali.gls = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(312995741696L, 2332);
      return 0;
    }
    GMTrace.o(312995741696L, 2332);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */