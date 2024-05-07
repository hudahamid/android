 ListView listView = findViewById(R.id.listView);
 ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
 android.R.layout.simple_list_item_1, arr);
 listView.setAdapter(adapter);
