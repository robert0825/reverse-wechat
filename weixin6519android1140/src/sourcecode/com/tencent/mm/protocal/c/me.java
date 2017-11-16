package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class me
  extends ayx
{
  public String eDW;
  public String fileid;
  public String ucW;
  public int ucX;
  
  public me()
  {
    GMTrace.i(4023310614528L, 29976);
    GMTrace.o(4023310614528L, 29976);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4023444832256L, 29977);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fileid == null) {
        throw new b("Not all required fields were included: fileid");
      }
      if (this.eDW == null) {
        throw new b("Not all required fields were included: md5");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.fileid != null) {
        paramVarArgs.e(2, this.fileid);
      }
      if (this.eDW != null) {
        paramVarArgs.e(3, this.eDW);
      }
      if (this.ucW != null) {
        paramVarArgs.e(4, this.ucW);
      }
      paramVarArgs.fk(5, this.ucX);
      GMTrace.o(4023444832256L, 29977);
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
      if (this.fileid != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fileid);
      }
      i = paramInt;
      if (this.eDW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eDW);
      }
      paramInt = i;
      if (this.ucW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ucW);
      }
      i = b.a.a.a.fh(5, this.ucX);
      GMTrace.o(4023444832256L, 29977);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.fileid == null) {
        throw new b("Not all required fields were included: fileid");
      }
      if (this.eDW == null) {
        throw new b("Not all required fields were included: md5");
      }
      GMTrace.o(4023444832256L, 29977);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      me localme = (me)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4023444832256L, 29977);
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
          localme.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4023444832256L, 29977);
        return 0;
      case 2: 
        localme.fileid = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4023444832256L, 29977);
        return 0;
      case 3: 
        localme.eDW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4023444832256L, 29977);
        return 0;
      case 4: 
        localme.ucW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4023444832256L, 29977);
        return 0;
      }
      localme.ucX = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4023444832256L, 29977);
      return 0;
    }
    GMTrace.o(4023444832256L, 29977);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */