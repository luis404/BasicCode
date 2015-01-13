#include <stddef.h>
struct cache_time {
	unsigned int sec;
	unsigned int nsec;
};

struct cache_entry {
	struct cache_time ctime;
	struct cache_time mtime;
	unsigned int st_dev;
	unsigned int st_ino;
	unsigned int st_mode;
	unsigned int st_uid;
	unsigned int st_gid;
	unsigned int st_size;
	unsigned char sha1[20];
	unsigned short namelen;
	unsigned char name[0];
};

int main(int argc, char **argv){

  printf("size of cache_entry: %d\n", sizeof(struct cache_entry));
  printf("offsetof name:%d\n", offsetof(struct cache_entry, name));
  printf("offsetof name:%d\n", offsetof(struct cache_entry, st_dev));

  return 0;
}
